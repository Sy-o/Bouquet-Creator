package bisnesslogic.factory;

import entity.flower.*;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 10, 2014
 * Time: 12:46:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlowerFactory {
    public Flower createFlower(String type, String color){
        Flower flower = null;
        if(type.equalsIgnoreCase("rose")){
            flower = new Rose(defineColor(color));
        }
        else{
            if(type.equalsIgnoreCase("tulip")){
                flower = new Tulip(defineColor(color));
            }
            else{
                if(type.equalsIgnoreCase("daisy")){
                    flower = new Daisy(defineColor(color));
                }
                else{
                    if(type.equalsIgnoreCase("lily")){
                        flower = new Lily(defineColor(color));
                    }
                    else{
                        if(type.equalsIgnoreCase("violet")){
                            flower = new Violet(defineColor(color));
                        }
                    }
                }
            }
        }
        return flower;
    }

    private ColorID defineColor(String color)
    {
        ColorID colorID = ColorID.WHITE;
        if( color.equalsIgnoreCase("red")){
            colorID = ColorID.RED;
        }
        else{
            if( color.equalsIgnoreCase("orange")){
                colorID = ColorID.ORANGE;
            }
            else{
                if( color.equalsIgnoreCase("yellow")){
                    colorID = ColorID.YELLOW;
                }
                else{
                    if( color.equalsIgnoreCase("pink")){
                        colorID = ColorID.PINK;
                    }
                    else{
                        if( color.equalsIgnoreCase("blue")){
                            colorID = ColorID.BLUE;
                        }
                        else{
                            if( color.equalsIgnoreCase("purple")){
                                colorID = ColorID.PURPLE;
                            }
                            else{
                                if( color.equalsIgnoreCase("white")){
                                    colorID = ColorID.WHITE;
                                }
                            }
                        }
                    }
                }
            }
        }
        return colorID;
    }
}
