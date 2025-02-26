public class Arma {
    private String nombreDelArma;
    private int rangoX = 5;//auxi coloque a su gusto el rango de disparo :D
    private int rangoY = 5;

    public Arma(String nombreDelArma) {
        this.nombreDelArma = nombreDelArma;
    }

    public void disparar(Isla isla, Posicion cordenadaActual) {
        if (cordenadaActual == null) {
            System.out.println("No se puede disparar. La posición del guerrero no está definida.");
            return;
        }

        int inicioX = cordenadaActual.getX();
        int inicioY = cordenadaActual.getY();

        int destinoX = Math.min(inicioX + rangoX, isla.getLimiteX());
        int destinoY = Math.min(inicioY + rangoY, isla.getLimiteY());

        System.out.println("El arma " + nombreDelArma + " disparó desde: " + inicioX + "," + inicioY + 
                           " hasta: " + destinoX + "," + destinoY);
    }
}
