package FlyWeight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CountryFactory {
    static Map<String, FlagType> flagTypes = new HashMap<>();
    public static FlagType getFlagType(String name, Color color, String otherData) {
        FlagType result = flagTypes.get(name);
        if (result == null) {
            result = new FlagType(name, color, otherData);
            flagTypes.put(name, result);
        }
        return result;
    }
}
