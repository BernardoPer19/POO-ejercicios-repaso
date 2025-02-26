public class Isla {
    private int limiteX;
    private int limiteY;
    private Robot[] listaDeHabitantes;
 
    public Isla(int limiteX, int limiteY) {
        this.limiteX = limiteX;
        this.limiteY = limiteY;
    }

   
    public int getLimiteX() {
        return limiteX;
    }

    public int getLimiteY() {
        return limiteY;
    }

    
    public String determinarArea(Posicion posicion) {
        int y = posicion.getY();

        if (y >= limiteY * 2 / 3) {
            return "Frontera";
        } else if (y >= limiteY / 3) {
            return "Medio";
        } else {
            return "Atras";
        }
    }
    
    
}
