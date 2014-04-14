package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:23:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Daisy extends Flower{
    private final FlowerID type;
    private ColorID color;

    public Daisy(ColorID clr){
        type = FlowerID.DAISY;
        color = clr;
    }

    @Override
    public String getType(){
        return "daisy";
    }
    @Override
    public String getName(){
        String name;
        name = getColor(this.color) + " " + getType();
        return name;
    }
}
