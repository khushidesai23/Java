//Khushi Desai
//21BCP264
//Facade Design pattern

import java.util.*;

interface Country {//creating interface
    public void countryName();
}

class India implements Country {
    @Override
    public void countryName() {
        System.out.println("Country Name: India");
    }
}

class USA implements Country {
    @Override
    public void countryName() {
        System.out.println("Country Name: USA");
    }
}

class France implements Country {
    @Override
    public void countryName() {
        System.out.println("Country Name: France");
    }
}

class World{//creating a Facade class
    private Country India;//creating objects of the interface
    private Country USA;
    private Country France;

    public World() {//constructor
        India = new India();
        USA = new USA();
        France = new France();
    }

    public void countryNameIndia(){//Facade method
        India.countryName();
    }

    public void countryNameUSA(){
        USA.countryName();
    }

    public void countryNameFrance(){
        France.countryName();
    }

}

public class Facade {//Client class
    public static void main(String[] args) {
        World world = new World();//Facade object
        world.countryNameIndia();
        world.countryNameUSA();
        world.countryNameFrance();
    }
}