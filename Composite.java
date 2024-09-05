//composite design pattern
//Khushi Desai
//21BCP264

import java.util.ArrayList;
import java.util.List;

class country{
    private String name;
    private String capital;
    private int population;
    private List<country> countries;

    public country(String name, String capital, int population){//creating a constructor
        this.name = name;
        this.capital = capital;
        this.population = population;
        countries = new ArrayList<country>();
    }

    public void add(country c){//adding a country
        countries.add(c);
    }

    public void remove(country c){
        countries.remove(c);
    }

    public List<country> getCountries(){//getting the list of countries
        return countries;
    }

    public String getName(){
        return name;
    }

    public String getCapital(){
        return capital;
    }

    public int getPopulation(){
        return population;
    }

    public String toString(){//to print the details of the country
        return "Name: " + name + ", Capital: " + capital + ", Population: " + population;
    }
}

public class Composite{
    public static void main(String[] args){
        country india = new country("India", "New Delhi", 1415347996);
        country japan = new country("Japan", "Tokyo", 125469016);
        country gujarat = new country("Gujarat", "Gandhinagar", 60439692);
        country rajasthan = new country("Rajasthan", "Jaipur", 78230816);
        country tokyo = new country("Tokyo", "Tokyo", 37194000);

        india.add(gujarat);
        india.add(rajasthan);
        japan.add(tokyo);

        //printing the details of the countries
        
        System.out.println(india);
        for(country c: india.getCountries()){
            System.out.println(c);
        }
        
        System.out.println(japan);
        for(country c: japan.getCountries()){
            System.out.println(c);
        }
    }
}

