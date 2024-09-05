//KHUSHI DESAI
//21BCP264
public class Singleton{
    public static void main(String args[]){
        country obj1 = country.getInstance();
        country obj2 = country.getInstance(); //new country() is not possible as the constructor is private
    }
}
class country{
    private static country obj = new country(); //creating a static object of the class country
    private country(){ //making the constructor private so that only one instance of the class can be created
      System.out.println("there are 195 contries in the world today"); 
    }
    //creating a static method to return the object of the class
    public static country getInstance(){
     //   System.out.println("India is one of the most diverse countries in the world");
        return obj;
    }
}

