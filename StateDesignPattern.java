//KHUSHI DESAI
//21BCP264
//State Design Pattern

interface CountryState{
    public void alert(Country country);
}

class Country{
    private CountryState currentstate;
    
    public Country(){
        currentstate = new NeutralState();
    }

    public void setCurrentstate(CountryState state){
        currentstate = state;
    }



    public void alert(){
        currentstate.alert(this);
    }
}

class NeutralState implements CountryState{
    @Override
    public void alert(Country country){
        System.out.println("Neutral State");
    }
}

class WarState implements CountryState{
    @Override
    public void alert(Country country){
        System.out.println("War State");
    }
}

class StateDesignPattern{
    public static void main(String[] args){
        Country country = new Country();
        country.alert();
        country.alert();
        country.setCurrentstate(new WarState());
        country.alert();
        country.alert();
        country.alert();
    }
}