//Abstract factory design pattern 
//KHUSHI DESAI
//21BCP264
interface Country{
    void goal();
}

class India implements Country{
    @Override
    public void goal(){
        System.out.println("India is famous for its culture");
    }
}
class USA implements Country{
    @Override
    public void goal(){
        System.out.println("USA is famous for its technology");
    }
}
class France implements Country{
    @Override
    public void goal(){
        System.out.println("France is famous for its fashion");
    }
}

interface State{
    void capital();
}

class Delhi implements State{

    @Override
    public void capital(){
        System.out.println("Delhi is the capital of India");
    }
}
class Washington implements State{

    @Override
    public void capital(){
        System.out.println("Washington is the capital of USA");
    }
}
class Paris implements State{

    @Override
    public void capital(){
        System.out.println("Paris is the capital of France");
    }
}
abstract class AbstractFactory{
    public abstract Country getCountry(String country);
    public abstract State getState(String capital);
}

class CountryFactory extends AbstractFactory{

    @Override
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

    @Override
    public State getState(String capital){
        return null;
    }
}

class StateFactory extends AbstractFactory{

    @Override
    public Country getCountry(String country){
        return null;
    }

    @Override
    public State getState(String capital){
        if(capital == null){
            return null;
        }
        if(capital.equalsIgnoreCase("Delhi")){
            return new Delhi();
        }
        else if(capital.equalsIgnoreCase("Washington")){
            return new Washington();
        }
        else if(capital.equalsIgnoreCase("Paris")){
            return new Paris();
        }
        return null;
    }
}

class FactoryProducer{
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Country")){
            return new CountryFactory();
        }
        else if(choice.equalsIgnoreCase("State")){
            return new StateFactory();
        }
        return null;    
    }
}

public class Abstract{
    public static void main(String[] args) {
        AbstractFactory countryFactory = FactoryProducer.getFactory("Country");
        Country country1 = countryFactory.getCountry("India");
        country1.goal();
        Country country2 = countryFactory.getCountry("USA");
        country2.goal();
        Country country3 = countryFactory.getCountry("France");
        country3.goal();

        System.out.println();

        AbstractFactory stateFactory = FactoryProducer.getFactory("State");
        State state1 = stateFactory.getState("Delhi");
        state1.capital();
        State state2 = stateFactory.getState("Washington");
        state2.capital();
        State state3 = stateFactory.getState("Paris");
        state3.capital();
    }
}