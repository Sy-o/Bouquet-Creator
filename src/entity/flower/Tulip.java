package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:22:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tulip extends Flower{
    private final FlowerID type;
    private ColorID color;

    public Tulip(ColorID clr){
        type = FlowerID.TULIP;
        color = clr;
    }

    @Override
    public String getType(){
        return "tulip";
    }
    @Override
    public String getName(){
        String name;
        name = getColor(this.color) + " " + getType();
        return name;
    }
}
