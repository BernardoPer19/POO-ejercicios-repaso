public class Guerreros extends Robot {

    protected String rolGue;
    protected Posicion cordenadaR;
    private Arma arma;
    public Guerreros(int id, int edad, String nombre, String estado, boolean herida, boolean cumple, Posicion coordenada, Arma arma ) {
        super(id, edad, nombre, estado);
        this.cordenadaR = coordenada;
        this.arma = arma;
    }

    public int obtenerVida() {
        return vida;
    }
    public boolean obtenerCum() {
        return cumple;
    }
    public boolean estaMuerto() {
        return muerto;
    }
    public void asignarVida(int vida) {
        this.vida = vida;
    }
    public String obtenerNombre() {
        return nombre;
    }
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

    public String obtenerPosicion(Isla posicionIsla){
        if(posicionIsla.determinarArea(cordenadaR) == "Frontera"){
            return rolGue = "Guerrero Frontera";
        }else if(posicionIsla.determinarArea(cordenadaR) == "Atras"){
            return rolGue = "Marino";
        }
        return rolGue;
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

    public void dispararArma(Isla isla) {
        if (arma == null) {
            System.out.println("El guerrero " + nombre + " no tiene un arma asignada.");
            return;
        }
        arma.disparar(isla, cordenadaR);
    }


    public void heridita() {
        herida = true;    

        if (!muerto) { 
            if (herida) {
                vida -= 10;
                System.out.println("El robot " + nombre + " fue jaripeado, vida restante: " + vida);
                if (vida <= 0) {
                    vida = 0;
                    muerto = true; 
                    System.out.println("El robot " + nombre + " fue detonado.");
                }
            } else {
                System.out.println("El robot " + nombre + " no está herido.");
            }
        } else {
            System.out.println("El robot " + nombre + " ya fue detonado");
        }
    }

    public void mostrarDatosGue() {
        System.out.println("\nRobot ID: " + id + 
            "\nNombre: " + nombre + 
            "\nEdad: " + edad + 
            "\nCumple: " + obtenerCum() +
            "\nVida: " + obtenerVida() + 
            "\nCoordenada: " + cordenadaR.obtenerCoordenadasDeLosRobot() + 
            "\nEstado: " + (muerto ? "Muerto" : "Vivo") + 
            "\nRol en el batalla: " + rolGue);
    }

}
