
public class Mochila{
    private Items[] arrItem;
    int contador;
    
    public Mochila (int capacidad){
        contador = 0;
        arrItem = new Items[capacidad];
    }

    public boolean anadirItems(Items nuevoItem) {
        if (contador >= arrItem.length) { 
            System.out.println("La mochila está llena. No se puede añadir más items.");
            return false;
        } else {
            arrItem[contador] = nuevoItem;
            contador++;
            return true;
        }
    }

    public void eliminarItems(int pos){

        if (pos < 0 || pos >= contador) { 
            System.out.println("No se puede eliminar. Posición inválida.");
        } 
        else{

            for(int i = pos ; i < contador -1 ; i++){
                arrItem[i] = arrItem[i+1];
            }

            arrItem[contador-1] = null;
            contador--;

    
        }
    }
    
    public void mostrarItems() {
        if (contador == 0) {
            System.out.println("La mochila está vacía.");
        } else {
            System.out.println("Items en la mochila:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + arrItem[i].toString());
            }
        }
    }

   
    public int obtenerCantidadItems() {
        return contador;
    }

   
    public int obtenerCapacidad() {
        return arrItem.length;
    }

}
