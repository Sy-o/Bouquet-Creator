package view;

import java.io.PrintStream;
import bisnesslogic.builder.Builder;
import entity.bouquet.Bouquet;
import bisnesslogic.to.BuilderTO;
import controller.Controller;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: Alice
 * Date: Apr 13, 2014
 * Time: 6:43:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class View {
    private final PrintStream out;
    private final Controller ctrl;

    private String[] flowers = {"Rose", "Daisy", "Lily","Tulip", "Violet"};
    private String[] colors = {"Red","Blue","Orange","Yellow","Pink","White","Purple"};
    private String[] packing = {"Paper","Mesh", "Cloth", "Cellophane","Tape"};
    private Random rand;

    public View(PrintStream out) {
        this.out = out;
        this.ctrl = Controller.getInstance();
        rand = new Random();
    }

    public BuilderTO stubUserInput(){
        BuilderTO to = new BuilderTO();
        to.addFlower(flowers[rand.nextInt(flowers.length)],colors[rand.nextInt(colors.length)]);
        to.addFlower(flowers[rand.nextInt(flowers.length)],colors[rand.nextInt(colors.length)]);
        to.addFlower(flowers[rand.nextInt(flowers.length)],colors[rand.nextInt(colors.length)]);
        to.addFlower(flowers[rand.nextInt(flowers.length)],colors[rand.nextInt(colors.length)]);
        to.addFlower(flowers[rand.nextInt(flowers.length)],colors[rand.nextInt(colors.length)]);
        to.setPacking(packing[rand.nextInt(packing.length)]);
        return to;
    }

    public void showMenu(){
        out.println("Welcome!");
        out.println("Your bouquet:");
        BuilderTO to = stubUserInput();
        Bouquet bqt;
        bqt = getBouquet(to);
        out.println(bqt.getName());
        out.println("Exit...");
    }

    private Bouquet getBouquet(BuilderTO to){
        return ctrl.getBouquet(to);
    }
}
