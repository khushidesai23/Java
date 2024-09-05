//Khushi Desai
//21BCP264

//Observer Design Pattern

import java.util.ArrayList;
import java.util.List;

class State{
    private String name;
    private Country country = new Country();
    public State (String name){
        this.name = name;
    }

    public void update() {
        System.out.println("New State: " + name + ", is added");
    }

    public void addState(Country add){
        this.country = add;
    }
}

class Country{
    List<State> states = new ArrayList<>();
    private String title;

    public void addState(State state){
        this.states.add(state);
    }

    public void removeState(State state){
        this.states.remove(state);
    }

    public void notifyNews(){
        for(State state : states){
            state.update();
        }
    }

    public void setNews(String title){
        this.title = title;
        notifyNews();
    }

}

public class ObserverDesignPattern{
    public static void main(String[] args){
        Country country = new Country();
        State state1 = new State("Telangana");
        State state2 = new State("Maharashtra");
        State state3 = new State("Gujarat");
        State state4 = new State("Goa");
        State state5 = new State("Hariyana");

        country.addState(state1);
        country.addState(state2);
        country.addState(state3);
        country.addState(state4);
        country.addState(state5);

        state1.addState(country);
        state2.addState(country);
        state3.addState(country);
        state4.addState(country);
        country.setNews("New State is added");
    }
}