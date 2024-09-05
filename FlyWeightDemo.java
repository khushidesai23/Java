
// import java.awt.*;

// import java.util.HashMap;
// import java.util.Map;

// import javax.swing.*;
// import java.util.ArrayList;
// import java.util.List;

// // The Flyweight class representing an individual country
// class Country {
//     private String name;
//     private String capital;
//     private FlagType flagImage;
    

//     public Country(String name, String capital, FlagType flagImage) {
//         this.name = name;
//         this.capital = capital;
//         this.flagImage = flagImage;
//     }
    
//     public Country(int x, int y, FlagType flagType) {
//     }

//     public void displayInfo(int x, int y, Graphics g) {
//         // Display shared information
//         flagImage.displayInfo(x, y, g);
//     }

//     public void displayInfo(Graphics graphics) {
//     }
// }

// class FlagType{
//     private String name;
//     private Color color;
//     private String otherData;

//     public FlagType(String name, Color color, String otherData) {
//         this.name = name;
//         this.color = color;
//         this.otherData = otherData;
//     }

//     public void displayInfo(int x, int y, Graphics g) {
//         g.setColor(color.GREEN);
//         g.fillRect(x, y, 100, 100);
//         g.setColor(Color.BLACK);
//         g.fillOval(x+10, y+10, 80, 80);
//     }
// }



// class CountryFactory {
//     static Map<String, FlagType> flagTypes = new HashMap<>();
//     public static FlagType getFlagType(String name, Color color, String otherData) {
//         FlagType result = flagTypes.get(name);
//         if (result == null) {
//             result = new FlagType(name, color, otherData);
//             flagTypes.put(name, result);
//         }
//         return result;
//     }
// }

// class World extends JFrame  {
//     private List<Country> countries = new ArrayList<>();

//     public void addCountry(int x, int y, String name, Color color, String otherData) {
//         FlagType flagType = CountryFactory.getFlagType(name, color, otherData);
//         Country country = new Country(x, y, flagType);
//         countries.add(country);
//     }

//     @Override
//     public void paint(Graphics graphics) {
//         for (Country country : countries) {
//         country.displayInfo(graphics);
//         }
//     }
// }

// public class FlyWeightDemo {
//     static int CANVAS_SIZE = 500;
//     static int FLAGS_TO_DRAW = 1000000;
//     static int FLAG_TYPES = 10;

//     public static void main(String[] args){

//         try{
//         World world = new World();
//         for (int i = 0; i < (FLAGS_TO_DRAW / FLAG_TYPES); i++) {
//             world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Canada", Color.RED, "New Delhi");
//             world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "USA", Color.BLUE, "Washington DC");
//         } 

//         world.setSize(CANVAS_SIZE, CANVAS_SIZE);
//         world.setVisible(true);
//         System.out.println("done");
//     }
//     catch(Exception e){
//         System.out.println(e);
//     }
//         System.out.println(FLAGS_TO_DRAW + " flags drawn");
//         System.out.println("---------------------");
//         System.out.println("Memory usage:");
//         System.out.println("Flag size (8 bytes) * " + FLAGS_TO_DRAW);
//         System.out.println("+ Country size (~30 bytes) * " + FLAG_TYPES + " ");
//         System.out.println("---------------------&&");
//         System.out.println("Total: " + (((FLAGS_TO_DRAW * 8) + (FLAG_TYPES * 30) )/ 1024 / 1024) + "MB (instead of " + ((FLAGS_TO_DRAW * 38) / 1024 / 1024) + "MB)");

//     }

//     private static int random(int min, int max){
//         return min + (int)(Math.random() * ((max - min) + 1));
//     }

// }



import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

class Country {
    private int x;
    private int y;
    private FlagType type;

    public Country(int x, int y, FlagType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}




class FlagType {
    private String name;
    private Color color;
    private String OtherData;

    public FlagType(String name, Color color, String OtherData) {
        this.name = name;
        this.color = color;
        this.OtherData = OtherData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}




class CountryFactory {
    static Map<String, FlagType> treeTypes = new HashMap<>();

    public static FlagType getCountryType(String name, Color color, String OtherData) {
        FlagType result = treeTypes.get(name);
        if (result == null) {
            result = new FlagType(name, color, OtherData);
            treeTypes.put(name, result);
        }
        return result;
    }
}





class World extends JFrame {
    private List<Country> countries = new ArrayList<>();

    public void addCountry(int x, int y, String name, Color color, String OtherData) {
        FlagType type = CountryFactory.getCountryType(name, color, OtherData);
        Country country = new Country(x, y, type);
        countries.add(country);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Country country : countries) {
            country.draw(graphics);
        }
    }
}






public class FlyWeightDemo {
    static int CANVAS_SIZE = 500;
    static int FLAGS_TO_DRAW = 1000000;
    static int FLAG_TYPES = 2;

    public static void main(String[] args) {
        World world = new World();
        for (int i = 0; i < Math.floor(FLAGS_TO_DRAW / FLAG_TYPES); i++) {
            world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Canada", Color.RED, "New Delhi");
            world.addCountry(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "USA", Color.BLUE,"Washington DC");
        }
        world.setSize(CANVAS_SIZE, CANVAS_SIZE);
        world.setVisible(true);

        System.out.println(FLAGS_TO_DRAW + " flags drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + FLAGS_TO_DRAW);
        System.out.println("+ FlagTypes size (~30 bytes) * " + FLAG_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((FLAGS_TO_DRAW * 8 + FLAG_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((FLAGS_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}



