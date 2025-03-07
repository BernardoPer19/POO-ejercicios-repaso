
public class Simple extends Spell{
    private double distance;

    public Simple(String name, double cost, double distance){
        super(name, cost);
        this.distance=distance;
    }

    public String cast(){
        String res = "";
        res = "spell simple" + "his name's: " +name+ "his cost's " +cost+ "his distance " +distance;
        return res;
    }

}
