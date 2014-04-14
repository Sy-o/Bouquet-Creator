package entity.flower;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 9, 2014
 * Time: 10:04:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Flower {
    private ColorID color;

    public Flower(){
        color = ColorID.WHITE;
    }
    public abstract String getName();
    public abstract String getType();
    
    public String getColor(ColorID color){
        String clr;
        switch(color){
            case BLUE:
                clr = "blue";
                break;
            case RED:
                clr = "red";
                break;
            case ORANGE:
                clr = "orange";
                break;
            case YELLOW:
                clr = "yellow";
                break;
            case PURPLE:
                clr = "purple";
                break;
            case PINK:
                clr = "pink";
                break;
            case WHITE:
                clr = "white";
                break;
            default:
                clr = "";
        }
        return clr;
    }
}
