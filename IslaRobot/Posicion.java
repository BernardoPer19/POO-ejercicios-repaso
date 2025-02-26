
public class Posicion {
    private int x;
    private int y;

   
    public Posicion() {
        this(0, 0);
    }

    
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

       public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public String obtenerCoordenadasDeLosRobot() {
    return "(" + x + ", " + y + ")";
}

    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

 
}
