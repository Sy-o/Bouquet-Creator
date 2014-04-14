package bisnesslogic.to;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 5:25:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class FlowerTO {
    private String flower;
    private String color;
    public FlowerTO(String flower, String color){
        this.flower = flower;
        this.color = color;
    }

    public String getFlower(){
        return flower;
    }

    public String getColor(){
        return color;
    }
}
