
/**

 */
public class Medicos extends Robot{

    protected Posicion cordenadaR;
    private Mochila mochila;
    private String RolMed;
    int capacidadMochila = 9;
    public Medicos(int id, int edad, String nombre, boolean herida, boolean cumple, Posicion coordenada, String estado) {
        super(id, edad, nombre, estado ); 

        this.cordenadaR = coordenada; 
        this.mochila = new Mochila(capacidadMochila);
    }

       public int obtenerVida(){return vida;}
    public boolean obtenerCum(){return cumple;}
    public boolean estaMuerto(){return muerto;}
    public void asignarVida(int vida){this.vida = vida;}
    public String obtenerNombre(){return nombre;}
    
    
    public String obtenerPosicion(Isla posicionIsla){

        if(posicionIsla.determinarArea(cordenadaR) == "Frontera"){
            return RolMed = "Enfermero (frontera)";
        }else if(posicionIsla.determinarArea(cordenadaR) == "Medio"){

            return RolMed = "Medico general (medio)";

        }
        return RolMed;
    }

    public boolean agregarItemMochila(Items item) {
        return mochila.anadirItems(item);
    }

    public void curarHeridos(Guerreros guerrero ){
        int sumaVida = 10;
        int vidaActual =guerrero.obtenerVida() + sumaVida ;

        if(guerrero.estaMuerto() == false){

            if(guerrero.obtenerVida() < 30){
                guerrero.asignarVida(vidaActual);
            }else{

                System.out.print("Ya fue detonado");
                guerrero.obtenerVida();
            }
        }

    }

    //hace q su cumpleaños sea hoy :D
    public void diaDeCUMple(){
        if(cumple == false){
            cumple = true;
        }
    }    
    
    
       private void morir() {
        muerto = true;
        vida = 0;
        System.out.println("El robot " + nombre + " ha muerto por salir de los límites de la isla.");
    }
    
       public void mover(Isla isla, int nuevaX, int nuevaY) {
        if (muerto) {
            System.out.println("El robot " + nombre + " ya está muerto y no puede moverse.");
            return;
        }

        
        if (nuevaX < 0 || nuevaY < 0 || nuevaX > isla.getLimiteX() || nuevaY > isla.getLimiteY()) {
            morir();
            return;
        }

      
        cordenadaR.setX(nuevaX);
        cordenadaR.setY(nuevaY);
        System.out.println("El guerrero " + nombre + " se movió a la nueva posición: " + nuevaX + ", " + nuevaY);
    }

       public void mostrarDatosGue() {
        System.out.println("\nRobot ID: " + id + 
            "\nNombre: " + nombre + 
            "\nEdad: " + edad + 
            "\nCumple" + obtenerCum() +
            "\nVida: " + obtenerVida() + 
            "\nCoordenada: " + cordenadaR.obtenerCoordenadasDeLosRobot() + 
            "\nEstado: " + (muerto ? "Muerto" : "Vivo") + 
            "\nRol de hospital: " + RolMed);
    }
}       
