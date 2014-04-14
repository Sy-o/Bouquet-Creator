package bisnesslogic.builder;

import entity.bouquet.Bouquet;
import bisnesslogic.factory.*;
import bisnesslogic.to.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 4:25:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Builder {
    FlowerFactory flFactory;
    PackingFactory pkFactory;

    public Builder(){
        flFactory = new FlowerFactory();
        pkFactory = new PackingFactory();
    }

    public Bouquet buildBouquet(BuilderTO to){
        Bouquet bqt = new Bouquet();
        for(FlowerTO flower: to.flowers){
            bqt.addFlower(flFactory.createFlower(flower.getFlower(), flower.getColor()));
        }
        bqt.changePacking(pkFactory.createPacking(to.packing));
        return bqt;
    }

    
}
