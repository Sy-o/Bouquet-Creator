package entity.packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:44:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class Cellophane extends Packing{
    private PackingID type;

    public Cellophane(){
        type = PackingID.CELLOPHANE;
    }

    @Override
    public String getType(){
        return "cellophane";
    }
}
