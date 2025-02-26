public class Hospital {
    private Posicion posHospital;
    private Medicos[] arrMeds;
    private int capacidadMaxima = 100; 
    private int contador;

  
    public Hospital(Posicion posHospital) {
        this.posHospital = posHospital;
        this.arrMeds = new Medicos[capacidadMaxima];
        this.contador = 0;
    }


    public boolean anadirMedicos(Medicos nuevoMedi) {
        if (contador >= capacidadMaxima) { 
            System.out.println("El hospital está lleno. No se puede añadir más médicos.");
            return false;
        } else {
            arrMeds[contador] = nuevoMedi;
            contador++;
            return true;
        }
    }


    public void eliminarMedicos(int pos) {
        if (pos < 0 || pos >= contador) { 
            System.out.println("No se puede eliminar. Posición inválida.");
        } else {
            for (int i = pos; i < contador - 1; i++) {
                arrMeds[i] = arrMeds[i + 1];
            }
            arrMeds[contador - 1] = null;
            contador--;
        }
    }

    
    public void mostrarMedicos() {
        if (contador == 0) {
            System.out.println("El hospital está vacío.");
        } else {
            System.out.println("Médicos en el hospital:");
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + arrMeds[i].obtenerNombre()); 
            }
        }
    }

 
    public int obtenerCantidadMedicos() {
        return contador;
    }

    
    public Posicion getPosicion() {
        return posHospital;
    }
}
