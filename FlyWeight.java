
import java.util.HashMap;

// A common interface for all countries
interface Country {
public void sayHello();
}

// Concrete flyweight class for a country
class ConcreteCountry implements Country {
private String name;


public ConcreteCountry(String name) {
    this.name = name;
}

// This method outputs the name of the country
public void sayHello() {
    System.out.println("Hello from " + name);
}
}

// Class used to get a country using HashMap (Returns
// an existing country if a country of the given name exists.
// Else creates a new country and returns it.)
class CountryFactory {
// HashMap stores the reference to the object of ConcreteCountry
private static HashMap<String, Country> countryMap = new HashMap<String, Country>();


// Method to get a country
public static Country getCountry(String name) {
    Country country = null;

    // If an object for the country has already been created, simply return its reference
    if (countryMap.containsKey(name)) {
        country = countryMap.get(name);
    } else {
        // Create an object of ConcreteCountry
        country = new ConcreteCountry(name);

        // Once created, insert it into the HashMap
        countryMap.put(name, country);
    }

    return country;
}
}

// Driver class
public class FlyWeight {
// All country names (used by getRandomCountryName())
private static String[] countryNames = {"India", "USA", "China", "Russia", "Japan"};

// Driver code
public static void main(String args[]) {
    // Assume that we have a total of 10 countries in the system.
    for (int i = 0; i < 10; i++) {
        // Get a random country name from the list of country names
        String name = getRandomCountryName();

        // Get the flyweight instance of the country
        Country country = CountryFactory.getCountry(name);

        // Say hello from the country
        country.sayHello();
    }
}

// Utility method to get a random country name
public static String getRandomCountryName() {
    int randInt = (int) (Math.random() * countryNames.length);

    // Return the country name stored at index 'randInt'
    return countryNames[randInt];
}
}