//Khushi Desai
//21BCP264

// Target interface that client uses to interact with the system
interface Country {
    public void countryName(String countryName, String governmentType);
}

// Adaptee interface that we need to adapt to the target interface

interface Government {
    void democratic (String countryName);
    void monarchy (String countryName);
}

// Concrete implementation of the Adaptee interface

class DemocraticCountry implements Government {
    @Override
    public void democratic (String countryName){
        System.out.println("Country Name: " + countryName+" is a democratic country");
    }
    @Override
    public void monarchy (String countryName){
        
    }
}

class MonarchyCountry implements Government {
    @Override
    public void democratic (String countryName){
        
    }
    @Override
    public void monarchy (String countryName){
        System.out.println("Country Name: " + countryName+" is a monarchy country");
    }
}


// Adapter class that adapts the Adaptee interface to the Target interface

class CountryAdapter implements Country {
    Government government;

    public CountryAdapter(String countryType) {
        if(countryType.equalsIgnoreCase("India")){
            government = new DemocraticCountry();
            
        }
        else if(countryType.equalsIgnoreCase("UAE")){
            government = new MonarchyCountry();

        }
    }

    @Override
    public void countryName(String countryName, String governmentType) {
        if(governmentType.equalsIgnoreCase("Democratic")){
            government.democratic(countryName);

        }
        else if(governmentType.equalsIgnoreCase("Monarchy")){
            government.monarchy(countryName);
        }
    }

}

class continent implements Country {
    CountryAdapter countryAdapter;
    public void countryName(String countryName, String governmentType){
        if(countryName.equalsIgnoreCase("USA")){
           System.out.println("Country Name: " + countryName+" is a democratic country");
        }
        else if(countryName.equalsIgnoreCase("UAE")||countryName.equalsIgnoreCase("India")) {
            countryAdapter = new CountryAdapter(countryName);
            countryAdapter.countryName(countryName, governmentType);
            
        }

        else{
            System.out.println("Country Name: "+countryName+" is not in the list");
        }
        
    }
    
}

// Client code that uses the Target interface
public class AdapterDesignPattern {
    public static void main(String[] args) {
        continent continent = new continent();
        
        continent.countryName("India", "Democratic");
        continent.countryName("UAE", "Monarchy");
        continent.countryName("USA", "Democratic");
        continent.countryName("UAK", "Monarchy");
    }
}
