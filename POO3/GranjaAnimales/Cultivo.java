import java.util.*;
/**
 * Write a description of class Cultivo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cultivo extends Recursos_Produccion{
      private ArrayList<Planta> lista_planta;

    public Cultivo(int cant_agua,String alimiento, String cuidados){
        super(cant_agua,alimiento,cuidados);
        this.lista_planta = new ArrayList<Planta>();
    }

    public  double vender(){
        double res = 1.0;
        return res;
    }

    public  double comprar(){
        double res = 1.0;
        return res;
    }

    public int getAgua(){
        return cant_agua;
    }
    
}
