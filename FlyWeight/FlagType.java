package FlyWeight;

import java.awt.*;

public class FlagType{
    private String name;
    private Color color;
    private String otherData;

    public FlagType(String name, Color color, String otherData) {
        this.name = name;
        this.color = color;
        this.otherData = otherData;
    }

    public void displayInfo(int x, int y, Graphics g) {
        g.setColor(color);
        g.fillRect(x-1, y, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(x+10, y+10, 80, 80);
    }
}