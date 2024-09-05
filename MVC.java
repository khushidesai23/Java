//Khushi Desai
//21BCP264

//MVC Design Pattern

class Country {
    private String name;
    private String capital;
    private long population;
    
    public Country(String name, String capital, long population) {
       this.name = name;
       this.capital = capital;
       this.population = population;
    }
    
    // getters and setters
    public String getName() {
       return name;
    }
    
    public void setName(String name) {
       this.name = name;
    }
    
    public String getCapital() {
       return capital;
    }
    
    public void setCapital(String capital) {
       this.capital = capital;
    }
    
    public long getPopulation() {
       return population;
    }
    
    public void setPopulation(long population) {
       this.population = population;
    }
 }
 
class CountryView {
    public void printCountryDetails(String countryName, String countryCapital, long countryPopulation) {
       System.out.println("Country: " + countryName);
       System.out.println("Capital: " + countryCapital);
       System.out.println("Population: " + countryPopulation);
    }
 }
 
class CountryController {
    private Country model;
    private CountryView view;
    
    public CountryController(Country model, CountryView view) {
       this.model = model;
       this.view = view;
    }
    
    public void setCountryName(String name) {
       model.setName(name);
    }
    
    public String getCountryName() {
       return model.getName();
    }
    
    public void setCountryCapital(String capital) {
       model.setCapital(capital);
    }
    
    public String getCountryCapital() {
       return model.getCapital();
    }
    
    public void setCountryPopulation(long population) {
       model.setPopulation(population);
    }
    
    public long getCountryPopulation() {
       return model.getPopulation();
    }
    
    public void updateView() {
       view.printCountryDetails(model.getName(), model.getCapital(), model.getPopulation());
    }
 }

 public class MVC {
    public static void main(String[] args) {
       // Create a country object
       Country country = new Country("United States of America", "Washington D.C.", 331449281);
       
       // Create a view object
       CountryView view = new CountryView();
       
       // Create a controller object
       CountryController controller = new CountryController(country, view);
       
       // Update model data
       controller.setCountryCapital("New York City");
       controller.setCountryPopulation(333042810);
       
       // Update the view
       controller.updateView();
    }
 }
 
 