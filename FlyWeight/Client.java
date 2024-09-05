package FlyWeight;

import java.awt.*;
public class Client {
    static int CANVAS_SIZE = 500;
    static int FLAGS_TO_DRAW = 500000;
    static int FLAG_TYPES = 2;

    public static void main(String[] args){
        World world = new World();
        for (int i = 0; i < (FLAGS_TO_DRAW / FLAG_TYPES); i++) {
            world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Canada", Color.RED, "New Delhi");
            world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "USA", Color.BLUE, "Washington DC");
        } 

        world.setSize(CANVAS_SIZE, CANVAS_SIZE);
        world.setVisible(true);

        System.out.println(FLAGS_TO_DRAW + " flags drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Flag size (8 bytes) * " + FLAGS_TO_DRAW);
        System.out.println("+ Country size (~30 bytes) * " + FLAG_TYPES + " ");
        System.out.println("---------------------");
        System.out.println("Total: " + ((FLAGS_TO_DRAW * 8) + (FLAG_TYPES * 30) / 1024 / 1024) + "MB (instead of " + ((FLAGS_TO_DRAW * 38) / 1024 / 1024) + "MB)");

    }

    private static int random(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }

}
