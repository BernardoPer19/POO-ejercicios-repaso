
public class Barco{
    protected int tripulacion;
    protected String nombre;
    
    public Barco(String nombre, int tripulacion){
        this.tripulacion = tripulacion;
        this.nombre= nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int CantTripulacion(){
        return tripulacion; 
    }
}
