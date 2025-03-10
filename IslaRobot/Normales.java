
/**
Los robots de guerra, además de lo que tiene todo robot, también tiene un arma, un grupo al que pertenece (17va division, frontera o marino) y 
una posición estratégica (frente, medio, back). Las armas tienen un rango de disparo y un nombre.
Adicionalmente estos robots tienen asociada una coordenada de rastreo que indica en qué punto del mapa se encuentran. 
 */
public class Normales extends Robot{

    protected boolean herida, cumple, muerto;
    protected Posicion cordenadaR;
    private Mochila mochila;
    int capacidadMochila = 9;
    String profesion;
    public Normales(int id, int edad, String nombre, String estado, boolean herida, Posicion coordenada, String profesion) {
        super(id, edad, nombre, estado);
        this.profesion = profesion;
        this.cordenadaR = coordenada; 

        this.mochila = new Mochila(capacidadMochila);
    }

    //hace q su cumpleaños sea hoy :D
    public void diaDeCUMple(){
        if(cumple == false){
            cumple = true;
        }
    }    

    public int obtenerVida(){return vida;}
    public boolean obtenerCum(){return cumple;}
    public boolean estaMuerto(){return muerto;}
    public void asignarVida(int vida){this.vida = vida;}
    public String obtenerNombre(){return nombre;}

    public String obtenerPosicion(Isla posicionIsla) {
        return posicionIsla.determinarArea(cordenadaR);
    }

    public boolean agregarItemAMochilaNormal(Items item) {
        return mochila.anadirItems(item);
    }

    public void felicitarElCum(Guerreros guerrito, Medicos medi){
        if(guerrito.obtenerCum()){
            System.out.println("felicidades cumpleaños a: " + guerrito.obtenerNombre());

        }

        if(medi.obtenerCum()){
            System.out.println("felicidades cumpleaños a: " + medi.obtenerNombre());
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
    
    public void mostrarDatosNormales() {
        System.out.println("\nRobot ID: " + id + 
            "\nNombre: " + nombre + 
            "\nEdad: " + edad + 
            "\nCumple" + obtenerCum() +
            "\nVida: " + obtenerVida() + 
            "\nCoordenada: " + cordenadaR.obtenerCoordenadasDeLosRobot() + 
            "\nEstado: " + (muerto ? "Muerto" : "Vivo") + 
            "\nRol en el el puebluito: " + profesion);
    }

}
