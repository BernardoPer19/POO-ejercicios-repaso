import java.util.ArrayList;
public class Magician{
    private String name;
    private int MagicPower;
    private ArrayList<Spell> spells;

    public Magician(String name, int MagicPower){
        this.name = name;
        this.MagicPower = MagicPower;
        this.spells = new ArrayList<Spell>();
    }

    public void Learn(Spell newSpell){
        spells.add(newSpell);
    }

    public void castSpell(){

        for(int i = 0; i <= spells.size() ; i++){
            Spell aux = spells.get(i);
            if(aux instanceof Advanced){
                System.out.print(aux.cast());
            }
            
        }
    }

}
