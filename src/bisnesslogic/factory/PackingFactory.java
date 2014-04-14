package bisnesslogic.factory;

import entity.packing.*;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 11, 2014
 * Time: 2:21:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class PackingFactory {
    public Packing createPacking(String type){
        Packing pack = null;
        if(type.equalsIgnoreCase("cloth")){
            pack = new Cloth();
        }
        else{
            if(type.equalsIgnoreCase("cellophane")){
                pack = new Cellophane();
            }
            else{
                if(type.equalsIgnoreCase("mesh")){
                    pack = new Mesh();
                }
                else{
                    if(type.equalsIgnoreCase("paper")){
                        pack = new Paper();
                    }
                    else{
                        if(type.equalsIgnoreCase("tape")){
                            pack = new Tape();
                        }
                    }
                }
            }
        }
        return pack;
    }
}
