public class Robot {
    protected String nombre, estado;
    protected int id, edad, vida;
    protected boolean herida, cumple, muerto;
    protected Posicion cordenadaR;
    
    
    public Robot(int id, int edad, String nombre, String estado ) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.vida = 30;
        this.herida = false;
        this.cumple = false;
        this.muerto = false;
        this.cordenadaR = new Posicion(20, 20);
    }


    public Posicion getCordenadaR() {
        return cordenadaR;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String obtenerAreaTrabjo(Isla isla) {
        return isla.determinarArea(cordenadaR);
    }

    
    public void mover(Isla isla, int deltaX, int deltaY) {
       if(muerto){
        System.out.print("el robot" + nombre + "fallecio");
        }
        

        int nuevaX = cordenadaR.getX()+ deltaX;
        int nuevaY = cordenadaR.getY()+ deltaY;
        if(deltaX < 0 || deltaY < 0 || deltaX > isla.getLimiteX() || deltaY > isla.getLimiteY()){
        morir();
        }else{

        cordenadaR.setX(nuevaX);
        cordenadaR.setY(nuevaY);
           System.out.print("el robot" + nombre + "se movio a: " + nuevaX + "," + nuevaY);
        }
    }

   
    private void morir() {
        muerto = true;
        vida = 0;
        System.out.println("El robot " + nombre + " ha muerto por salir de los límites de la isla.");
    }



    public String mostrarDatos() {
        return "Robot ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Vida: " + vida + 
               ", Coordenada: " + cordenadaR + ", Estado: " + (muerto ? "Muerto" : "Vivo");
    }
}
