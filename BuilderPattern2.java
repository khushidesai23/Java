//KHUSHI DESAI
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

class CountryBuilder{
    private String countryName;
    private String capital;
    private String language;
    private String currency;
    private String famous;

    public CountryBuilder setCountryName(String countryName){
        this.countryName = countryName;
        return this;
    }
    public CountryBuilder setCapital(String capital){
        this.capital = capital;
        return this;
    }
    public CountryBuilder setLanguage(String language){
        this.language = language;
        return this;
    }
    public CountryBuilder setCurrency(String currency){
        this.currency = currency;
        return this;
    }

    public CountryBuilder setFamous(String famous){
        this.famous = famous;
        return this;
    }

    public Country getCountry(){
        return new Country(countryName, capital, language, currency, famous);
    }

}

public class BuilderPattern2{
    public static void main(String[] args) {
        Country India = new CountryBuilder().setCountryName("India").setCapital("Delhi").setLanguage("Hindi").setCurrency("Rupee").getCountry();
        Country USA = new CountryBuilder().setCountryName("USA").setCapital("Washington DC").setLanguage("English").setCurrency("Dollar").getCountry();
        Country France = new CountryBuilder().setCountryName("France").setCapital("Paris").setLanguage("French").setCurrency("Euro").getCountry();
        
        System.out.println(India);
        System.out.println(USA);
        System.out.println(France);
    }
}
