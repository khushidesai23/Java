//KHUSHI DESAI
//21BCP264


interface Country{
    void famous();
    void capital();
    void language();
    void currency();
}

class India implements Country{
    public void famous(){
        System.out.println("India is famous for its culture");
    }
    public void capital(){
        System.out.println("India's capital is New Delhi");
    }
    public void language(){
        System.out.println("India's language is Hindi");
    }
    public void currency(){
        System.out.println("India's currency is Rupee\n");
    }   
}

class USA implements Country{
    public void famous(){
        System.out.println("USA is famous for its technology");
    }
    public void capital(){
        System.out.println("USA's capital is Washington DC");
    }
    public void language(){
        System.out.println("USA's language is English");
    }
    public void currency(){
        System.out.println("USA's currency is Dollar\n");
    }
}

class France implements Country{
    public void famous(){
        System.out.println("France is famous for its fashion");
    }
    public void capital(){
        System.out.println("France's capital is Paris");
    }
    public void language(){
        System.out.println("France's language is French");
    }
    public void currency(){
        System.out.println("France's currency is Euro\n");
    }
}

class CountryFactory{
    public Country getCountry(String country){
        if(country == null){
            return null;
        }
        if(country.equalsIgnoreCase("India")){
            return new India();
        }
        else if(country.equalsIgnoreCase("USA")){
            return new USA();
        }
        else if(country.equalsIgnoreCase("France")){
            return new France();
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        CountryFactory countryFactory = new CountryFactory();
        Country country1 = countryFactory.getCountry("India");
        country1.famous();
        country1.capital();
        country1.language();
        country1.currency();

        Country country2 = countryFactory.getCountry("USA");
        country2.famous();
        country2.capital();
        country2.language();
        country2.currency();
        
        Country country3 = countryFactory.getCountry("France");
        country3.famous();
        country3.capital();
        country3.language();
        country3.currency();
    }
}



