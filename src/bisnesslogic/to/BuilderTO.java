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

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * this.packing.length();
        result += result * prime + 172447 * ((this.flowers.size() > 7) ? 1 : 0);
        return result;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        str.append(this.getClass().getName() + " Object {" + NEWLINE);
        str.append("  flowers: ");
        for(FlowerTO flower: flowers){
            str.append(flower.getColor() + " " + flower.getFlower() + ", ");
        }
        str.append(NEWLINE);
        str.append("  packing: " + packing + NEWLINE);
        str.append("}");
        return str.toString();
    }
}
