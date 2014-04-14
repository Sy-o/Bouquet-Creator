package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:19:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class Lily extends Flower{
    private final FlowerID type;
    private ColorID color;

    public Lily(ColorID clr){
        type = FlowerID.LILY;
        color = clr;
    }

    @Override
    public String getType(){
        return "lily";
    }
    @Override
    public String getName(){
        String name;
        name = getColor(this.color) + " " + getType();
        return name;
    }
}
