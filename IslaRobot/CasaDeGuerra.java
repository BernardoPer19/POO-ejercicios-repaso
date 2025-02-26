public class CasaDeGuerra {
    private Posicion posCasaDeGuerra;
    private Guerreros[] arrGuerres;
    private  int capacidadMaxima = 100; 
    private int contador;

  
    public CasaDeGuerra(Posicion posCasaDeGuerra) {
        this.posCasaDeGuerra = posCasaDeGuerra;
        this.arrGuerres = new Guerreros[capacidadMaxima];
        this.contador = 0;
    }


    public boolean anadirGuerreros(Guerreros nuevoGuerre) {
        if (contador >= capacidadMaxima) { 
            System.out.println("la casa está llena. No se puede añadir más guerreros.");
            return false;
        } else {
            arrGuerres[contador] = nuevoGuerre;
            contador++;
            return true;
        }
    }


    public void eliminarGuerreros(int pos) {
        if (pos < 0 || pos >= contador) { 
            System.out.println("No se puede eliminar. Posición inválida.");
        } else {
            for (int i = pos; i < contador - 1; i++) {
                arrGuerres[i] = arrGuerres[i + 1];
            }
            arrGuerres[contador - 1] = null;
            contador--;
        }
    }

  
    public void mostrarGuerreros() {
        if (contador == 0) {
            System.out.println("la casa está vacío.");
        } else {
            System.out.println("Guerreros activos::");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + arrGuerres[i].obtenerNombre()); 
            }
        }
    }

 
    public int obtenerCantidadMedicos() {
        return contador;
    }

    
    public Posicion getPosicion() {
        return posCasaDeGuerra;
    }
}
