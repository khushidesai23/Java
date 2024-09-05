//KHUUSHI DESAI
//21BCP264
//Builder design pattern

class Country{
    private String countryName;
    private String capital;
    private String language;
    private String currency;
    private String famous;

    public Country(String countryName, String capital, String language, String currency, String famous){
        this.countryName = countryName;
        this.capital = capital;
        this.language = language;
        this.currency = currency;
        this.famous = famous;
    }

    public String toString(){
        return "Country: [" + countryName + ", Capital: " + capital + ", Language: " + language + ", Currency: " + currency + ", Famous: " + famous +"]";
    }
}

public class BuilderDesign{
    public static void main(String[] args) {
        Country India = new Country("India", "Delhi", "Hindi","Rupee" , "India is famous for its culture");
        Country USA = new Country("USA", "Washington DC", "English","Dollar" , "USA is famous for its technology");
        Country France = new Country("France", "Paris", "French","Euro" , "France is famous for its fashion");
        
        System.out.println(India);
        System.out.println(USA);
        System.out.println(France);
    }
}