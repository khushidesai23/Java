//lazy singleton
//Khushi Desai
//21BCP264
public class lazySingleton{
    public static void main(String args[]){
        country obj1 = country.getInstance();// the object is created only when the getInstance() method is called
    }
}
//created static object and made the constructor private
class country{
    private static country obj;//initializing the object and create within the getInstance() method
    private country(){
        System.out.println("there are 195 contries in the world today"); 
    }
    public static country getInstance(){
        obj = new country();//cteate object and now it will be lazy
      //  System.out.println("India is one of the most diverse countries in the world");
        return obj;
    }
}