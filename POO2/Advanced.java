
public class Advanced extends Spell{
    private int damage;
    
    public Advanced(String name, double cost, int damage){
        super(name, cost);
        this.damage = damage;
    }
    
    public String cast(){
        String res = "";
        res = "spell advanced "+ "his name's " + name + " his cost's: " + cost + " his damage : " + damage;
        return res;
    }
}
