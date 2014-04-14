package entity.bouquet;

import java.util.ArrayList;
import java.util.List;
import entity.flower.Flower;
import entity.packing.Packing;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 3:57:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bouquet {
    List<Flower> flowers;
    Packing packing;

    public Bouquet(){
        flowers = new ArrayList<Flower>();
    }

    public void addFlower(Flower flower){
        flowers.add(flower);
    }

    public void changePacking(Packing packing){
        this.packing = packing;
    }

    public String getName(){
        if(flowers != null && packing!= null){
            StringBuilder str = new StringBuilder();
            for(Flower flower: flowers){
                str.append(flower.getName() + ", ");
            }
            str.append("in " + packing.getType());
            return str.toString();
        }
        return null;
    }

    
}
