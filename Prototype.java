//Khushi Desai
//21BCP264
import java.util.ArrayList;
import java.util.List;


class Country{
    private String name;
    private String capital;
    
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
    
    @Override
    public String toString(){
        return "[Country name=" + name + ", capital=" + capital + "]";
    }
}


class Map implements Cloneable {//implements Cloneable to clone the object
    private String mapName;
    List<Country> countries = new ArrayList<Country>();//creating a list of countries
    
    public String getMapName() {//getter and setter methods
        return mapName;
    }
    
    public void setMapName(String mapName) {
        this.mapName = mapName;
    }
    
    public List<Country> getCountries() {
        return countries;
    }
    
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
    
    public void loadData(){
        
        Country country1 = new Country();
        country1.setName("India");
        country1.setCapital("New Delhi");
        
        Country country2 = new Country();
        country2.setName("China");
        country2.setCapital("Beijing");
        
        countries.add(country1);
        countries.add(country2);
    }
    
    @Override
    public String toString() {
        return "MapName=" + mapName + ", countries=" + countries;
    }    

    @Override
    protected Map clone() throws CloneNotSupportedException{
        return (Map)super.clone();
    }

    
}

public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Map map = new Map();
        map.setMapName("Physical Map");

        map.loadData();
        System.out.println(map);

        Map map2 = (Map)map.clone();
        map.getCountries().remove(1);
        map2.setMapName("Political Map");
                    
        System.out.println(map2);
    
    }
}