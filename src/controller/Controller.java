package controller;

import bisnesslogic.builder.Builder;
import entity.bouquet.Bouquet;
import bisnesslogic.to.BuilderTO;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 5:32:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Controller {
    Builder builder;
    private Controller() {
        builder = new Builder();
    }

    private static class InstanceHolder {
        private static final Controller INSTANCE = new Controller();
    }

    public static Controller getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public Bouquet getBouquet(BuilderTO to){
        return builder.buildBouquet(to);        
    }
}
