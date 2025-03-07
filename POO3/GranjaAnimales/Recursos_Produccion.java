
public abstract class Recursos_Produccion{
    protected int cant_agua;
    protected String alimiento,cuidados;

    public Recursos_Produccion(int cant_agua,String alimiento, String cuidados){
        this.cant_agua = cant_agua;
        this.alimiento = alimiento;
        this.cuidados = cuidados;
    }

    public abstract double vender();

    public abstract double comprar();

}
