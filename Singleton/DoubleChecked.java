//Double checked Singleton
//Khushi Desai
//21BCP264
public class DoubleChecked{
    public static void main(String[] args){
        Thread t1 = new Thread (new Runnable(){
           public void run(){
            country obj = country.getInstance();
           } 
        });
        Thread t2 = new Thread (new Runnable(){
           public void run(){
            country obj = country.getInstance();
           } 
        });
        t1.start();
        t2.start();
    }
}
//creating static object and making the constructor private
class country{
    public static country obj;
    private country(){
        System.out.println("there are 195 countries in the world");
    }
    //public static synchronized country getInstance(){
    public static country getInstance(){ //removing the synchronized keyword for double checked singleton
        if(obj == null){
            synchronized(country.class){
                if(obj == null){
                    obj = new country();//creating the object only when the object is null
                }
            }
        }
        return obj;
    }
}
