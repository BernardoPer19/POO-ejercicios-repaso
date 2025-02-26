
public class Pesquero extends Barco{
    private int almacen;
    private int capacidadMaxima;
    public Pesquero(String nombre,int tripulacion){
        super(nombre,tripulacion);
        almacen = 49;
        capacidadMaxima = 50;
    }

    public String pescar (){
        String res = "" ;
        if(almacen >= capacidadMaxima){
            return res="Se llenó el almacen";
        }else{
            almacen++;
            return "pescamos 1 pez tenemos: " + almacen;

        }
    }

    public int getCantidadAlmacen(){
        return almacen;
    }
}
