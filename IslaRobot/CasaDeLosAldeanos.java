public class CasaDeLosAldeanos {
    private Posicion poscasita;
    private Normales[] arrAldeano;
    private int capacidadMaxima = 3; 
    private int contador;

  
    public CasaDeLosAldeanos(Posicion posHospital) {
        this.poscasita = poscasita;
        this.arrAldeano = new Normales[capacidadMaxima];
        this.contador = 0;
    }


    public boolean anadirAldeano(Normales nuevoAldeano) {
        if (contador >= capacidadMaxima) { 
            System.out.println("la casa esta llena, habra sobre poblacion D:");
            return false;
        } else {
            arrAldeano[contador] = nuevoAldeano;
            contador++;
            return true;
        }
    }


    public void eliminarAldeano(int pos) {
        if (pos < 0 || pos >= contador) { 
            System.out.println("No se puede eliminar. Posición inválida.");
        } else {
            for (int i = pos; i < contador - 1; i++) {
                arrAldeano[i] = arrAldeano[i + 1];
            }
            arrAldeano[contador - 1] = null;
            contador--;
        }
    }


    public void mostrarAldeanitos() {
        if (contador == 0) {
            System.out.println("la casa está vacío.");
        } else {
            System.out.println("Aldeanos en la casa: ");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + arrAldeano[i].obtenerNombre()); 
            }
        }
    }

 
    public int obtenerCantidadAldenitos() {
        return contador;
    }

    
    public Posicion getPosicion() {
        return poscasita;
    }
}
