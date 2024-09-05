
//Khushi Desai
//21BCP264

//Memento Design Pattern

import java.util.ArrayList;
import java.util.List;

class Memento{
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}

class Originator{
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}

class Country{
    private List<Memento> states = new ArrayList<Memento>();

    public void add(Memento state){
        states.add(state);
    }

    public Memento get(int index){
        return states.get(index);
    }
}

public class MementoDesignPattern {
    public static void main(String[] args){
        Originator originator = new Originator();
        Country country = new Country();

        originator.setState("India");
        originator.setState("USA");
        country.add(originator.saveStateToMemento());

        originator.setState("China");
        country.add(originator.saveStateToMemento());

        originator.setState("Russia");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(country.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(country.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
