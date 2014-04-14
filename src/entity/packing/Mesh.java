package entity.packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:42:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Mesh extends Packing{
    private PackingID type;

    public Mesh(){
        type = PackingID.MESH;
    }

    @Override
    public String getType(){
        return "floral mesh";
    }
}
