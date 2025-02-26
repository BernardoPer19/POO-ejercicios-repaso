
public class Fragata extends Barco{
    private int cañones;
    private int disparo;
    private int distanciaProyectil;
    public Fragata(String nombre,int tripulacion){
        super(nombre,tripulacion);
        cañones = 3;
        distanciaProyectil = 50;
    }

    public String disparar (){
        disparo++;
        return "el barco disparo";
    }

    public String getCantidadAlmacen(){
        return "el barco disparo: "+ disparo + " veces";
    }
}
