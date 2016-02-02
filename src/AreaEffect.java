import java.awt.geom.Area;

/**
 * Created by Bradley on 2/1/16.
 */
public class AreaEffect {
    private String type;
    private int amountOfDamage;

    public AreaEffect(String type, int amountOfDamage){
        this.type = type;
        this.amountOfDamage = amountOfDamage;
    }

    public String getType(){
        return type;
    }

    public int getAmountOfDamage(){
        return amountOfDamage;
    }

    public void trigger(Entity entity){
        // TODO: Implement area effect triggering.
    }
}
