package FlyWeight;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class World extends JFrame{
    private List<Country> countries = new ArrayList<>();

    public void addCountry(int x, int y, String name, Color color, String otherData) {
        FlagType flagType = CountryFactory.getFlagType(name, color, otherData);
        Country country = new Country(x, y, flagType);
        countries.add(country);
    }

    @Override
    public void paint(Graphics graphics) {
        for (Country country : countries) {
        country.displayInfo(graphics);
        }
    }
}
