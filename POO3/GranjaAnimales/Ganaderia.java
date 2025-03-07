import java.util.ArrayList;
public class Ganaderia extends Recursos_Produccion{

    private ArrayList<Animal> lista_animales;

    public Ganaderia(int cant_agua,String alimiento, String cuidados){
        super(cant_agua,alimiento,cuidados);
        this.lista_animales = new ArrayList<Animal>();
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
    
    public void setAlimento(String nuevoAlimento){
        this.alimiento = nuevoAlimento;
    }
    
      public String getAlimento(){
        return alimiento;
    }
    
   public String getCuidados(){
        return cuidados;
    }
}
