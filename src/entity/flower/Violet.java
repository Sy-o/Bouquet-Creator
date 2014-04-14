package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:26:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class Violet extends Flower{
    private final FlowerID type;
    private ColorID color;

    public Violet(ColorID clr){
        type = FlowerID.VIOLET;
        color = clr;
    }

    @Override
    public String getType(){
        return "violet";
    }
    @Override
    public String getName(){
        String name;
        name = getColor(this.color) + " " + getType();
        return name;
    }
}
