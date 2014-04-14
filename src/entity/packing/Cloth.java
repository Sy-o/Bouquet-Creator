package entity.packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:41:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Cloth extends Packing{
    private PackingID type;

    public Cloth(){
        type = PackingID.CLOTH;
    }

    @Override
    public String getType(){
        return "floral cloth";
    }
}
