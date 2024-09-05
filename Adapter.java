//Adapter Design Pattern
//Purpose: To convert the interface of a class into another interface clients expect.
//Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

interface WorldMap{
    public void map(String continentName, int totalCountries );
}

interface Country{
    public void countryName(String countryName);
    public void capital(String capital);
}

class India implements Country{
    @Override
    public void countryName(String countryName){
        System.out.println("Country Name: " + countryName);
    }
    @Override
    public void capital(String capital){
        System.out.println("Capital: " + capital);
    }
}

class USA implements Country{
    @Override
    public void countryName(String countryName){
        System.out.println("Country Name: " + countryName);
    }
    @Override
    public void capital(String capital){
        System.out.println("Capital: " + capital);
    }
}

class Continent implements WorldMap{
    Country country;
    public Continent(String country){
        if(country.equalsIgnoreCase("India")){
            this.country = new India();
        }
        else if(country.equalsIgnoreCase("USA")){
            this.country = new USA();
        }
    }
    @Override
    public void map(String continentName, int totalCountries){
        if(continentName.equalsIgnoreCase("Asia")){
            System.out.println("Continent Name: " + continentName);
            System.out.println("Total Countries: " + totalCountries);
            
                
        }
        else if(continentName.equalsIgnoreCase("Europe")){
            System.out.println("Continent Name: " + continentName);
            System.out.println("Total Countries: " + totalCountries);
            
    
        }  
    }
}

class Aapter implements WorldMap{
    Continent asia;
    
    @Override
    public void map(String continentName, int totalCountries){
        if (continentName.equalsIgnoreCase("Asia")){
            System.out.println("Continent Name: " + continentName);
        }
        else if (continentName.equalsIgnoreCase("Africa") || continentName.equalsIgnoreCase("Europe") || continentName.equalsIgnoreCase("North America") || continentName.equalsIgnoreCase("South America") || continentName.equalsIgnoreCase("Australia") || continentName.equalsIgnoreCase("Antarctica")){
            asia = new Continent(continentName);
            asia.map(continentName, totalCountries);
        }
        else{
            System.out.println("Invalid Continent Name: " + continentName+ " or Total Countries: " + totalCountries);
        }
    }
}

public class Adapter{
    public static void main(String[] args){
        WorldMap worldMap = new Aapter();
        worldMap.map("Asia", 50);
        worldMap.map("Africa", 54);
        worldMap.map("Europe", 47);
        worldMap.map("North America", 23);
        worldMap.map("South America", 12);
        worldMap.map("Australia", 14);
        worldMap.map("Antarctica", 0);
        worldMap.map("USA", 15);
    }
}