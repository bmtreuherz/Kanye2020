/**
 * Created by Bradley on 2/1/16.
 */
public class Item {
    private String name;
    private String type;

    public Item(String name, String type){
        this.name=name;
        this.type=type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public boolean trigger(Entity entity){
        //TODO: Implement how an item should be triggered.
        return true;
    }
}
