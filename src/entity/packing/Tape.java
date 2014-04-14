package entity.packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:45:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tape extends Packing{
    private PackingID type;

    public Tape(){
        type = PackingID.TAPE;
    }

    @Override
    public String getType(){
        return "floral tape";
    }
}
