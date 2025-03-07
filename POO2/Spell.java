
public abstract class Spell{
    protected String name;
    protected double cost;

    public Spell(String name, double cost){
        this.name = name;
        this.cost = cost;
    }

    public abstract String cast();

}
