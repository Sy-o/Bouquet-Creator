package entity.packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:39:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Paper extends Packing{
    private PackingID type;

    public Paper(){
        type = PackingID.PAPER;
    }

    @Override
    public String getType(){
        return "floral paper";
    }
}
