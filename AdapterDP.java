// Target interface that client uses to interact with the system
interface Country {
    public String getName();
    public String getCapital();
    public int getPopulation();
}

// Adaptee interface that we need to adapt to the target interface

interface CountryData {
    public String country();
    public String capitalCity();
    public int populationSize();
}

// Concrete implementation of the Adaptee interface

class CountryDataCSV implements CountryData {
    private String name;
    private String capital;
    private int population;

    public CountryDataCSV(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    @Override
    public String country() {
        return this.name;
    }

    @Override
    public String capitalCity() {
        return this.capital;
    }

    @Override
    public int populationSize() {
        return this.population;
    }
}

// Adapter class that adapts the Adaptee interface to the Target interface

class CountryAdapter implements Country {
    private CountryData countryData;

    public CountryAdapter(CountryData countryData) {
        this.countryData = countryData;
    }

    @Override
    public String getName() {
        return this.countryData.country();
    }

    @Override
    public String getCapital() {
        return this.countryData.capitalCity();
    }

    @Override
    public int getPopulation() {
        return this.countryData.populationSize();
    }
}

// Client code that uses the Target interface
public class AdapterDP {
    public static void main(String[] args) {
        // Create an instance of the Adaptee interface
        CountryDataCSV countryData = new CountryDataCSV("USA", "Washington D.C.", 328200000);

        // Use the Adapter to adapt the Adaptee interface to the Target interface
        Country country = new CountryAdapter(countryData);

        // Use the Target interface to interact with the system
        System.out.println("Country: " + country.getName());
        System.out.println("Capital: " + country.getCapital());
        System.out.println("Population: " + country.getPopulation());
    }
}
