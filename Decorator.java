//Khushi Desai
//21BCP264

// Interface defining the behavior of the objects
interface Country{
    void name();
    }
    
    // Concrete implementation of the Country interface representing India
    class India implements Country{
    @Override
    public void name() {
    System.out.println("India");
    }
    }
    
    // Concrete implementation of the Country interface representing USA
    class USA implements Country{
    @Override
    public void name() {
    System.out.println("USA");
    }
    }
    
    // Abstract decorator class that implements the Country interface
    abstract class CountryDecorator implements Country{
    protected Country decoratedCountry;
    
   
    // Constructor that accepts an object of type Country
    public CountryDecorator(Country decoratedCountry){
        this.decoratedCountry = decoratedCountry;
    }
    
    // Implementing the Country interface method by calling the same method of the decorated object
    public void name(){
        decoratedCountry.name();
    }
    }
    
    // Concrete decorator class that adds capital functionality to a Country object
    class Capital extends CountryDecorator{
    // Constructor that accepts an object of type Country
    public Capital(Country decoratedCountry) {
    super(decoratedCountry);
    }
    
  
    // Override the name() method to add the capital functionality
    public void name(){
        decoratedCountry.name();
        setCapital(decoratedCountry);
    }
    
    // Method to set the capital of a country based on its instance type
    private void setCapital(Country decoratedCountry){
        if(decoratedCountry instanceof India){
            System.out.println("New Delhi");
        }
        else if(decoratedCountry instanceof USA){
            System.out.println("Washington DC");
        }
    }
    }
    
    // Main class to test the Decorator pattern
    public class Decorator {
    public static void main(String[] args) {
    // Create objects of type India and USA
    Country india = new India();
    Country CapitalOfIndia = new Capital(new India());
    Country CapitalOfUSA = new Capital(new USA());
    
    
        // Display the country name
        System.out.println("Country name: India");
        india.name();
    
        // Display the country name with capital
        System.out.println("Country name: India with Capital: New Delhi");
        CapitalOfIndia.name();
    
        // Display the country name with capital
        System.out.println("Country name: USA with Capital: Washington DC");
        CapitalOfUSA.name();
    }
    }