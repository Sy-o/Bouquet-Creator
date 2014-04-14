package bisnesslogic.to;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 5:11:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class BuilderTO {
    public List<FlowerTO> flowers;
    public String packing;

    public BuilderTO(){
        flowers = new ArrayList<FlowerTO>();
    }

    public void addFlower(String flower, String color){
        flowers.add(new FlowerTO(flower, color));
    }

    public void setPacking(String packing){
        this.packing = packing;
    }
}
