package FlyWeight;
import java.awt.*;

// The Flyweight class representing an individual country
public class Country {
    private String name;
    private String capital;
    private FlagType flagImage;
    

    public Country(String name, String capital, FlagType flagImage) {
        this.name = name;
        this.capital = capital;
        this.flagImage = flagImage;
    }
    
    public Country(int x, int y, FlagType flagType) {
    }

    public void displayInfo(int x, int y, Graphics g) {
        // Display shared information
        flagImage.displayInfo(x, y, g);
    }

    public void displayInfo(Graphics graphics) {
    }
}