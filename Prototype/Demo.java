package Prototype;
import java.util.ArrayList;
import java.util.List;


class Country{
    private String name;
    private String capital;
    private String language;
    private String currency;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getCapital(){
        return capital;
    }
    public void setCapital(String capital){
        this.capital = capital;
    }
    
    public String getLanguage(){
        return language;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    
    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }
    
    @Override
    public String toString(){
        return "Country [name=" + name + ", capital=" + capital + ", language=" + language + ", currency=" + currency + "]";
    }
}

class Map {
    private String ContinentName;
    List<Country> countries = new ArrayList<Country>();
    
    public String getContinentName() {
        return ContinentName;
    }
    
    public void setContinentName(String continentName) {
        ContinentName = continentName;
    }
    
    public List<Country> getCountries() {
        return countries;
    }
    
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
    
    @Override
    public String toString() {
        return "Map [ContinentName=" + ContinentName + ", countries=" + countries + "]";
    }    
}

public class Demo {
    public static void main(String[] args) {
        Map map = new Map();
        map.setContinentName("Asia");

        Country country1 = new Country();
        country1.setName("India");
        country1.setCapital("New Delhi");
        country1.setLanguage("Hindi");
        country1.setCurrency("Rupee");

        Country country2 = new Country();
        country2.setName("USA");
        country2.setCapital("Washington DC");
        country2.setLanguage("English");
        country2.setCurrency("Dollar");
        
        map.getCountries().add(country1);
        map.getCountries().add(country2);
        System.out.println(map);
    
    }
}