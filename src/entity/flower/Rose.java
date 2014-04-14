package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 9, 2014
 * Time: 10:14:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rose extends Flower{
    private final FlowerID type;
    private ColorID color;

    public Rose( ColorID clr){
        type = FlowerID.ROSE;
        color = clr;
    }

    @Override
    public String getType(){
        return "rose";
    }
    @Override
    public String getName(){
        String name;
        name = getColor(this.color) + " " + getType();
        return name;
    }
}
