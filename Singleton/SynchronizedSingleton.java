//Synchronized Singleton
//Khushi Desai
//21BCP264
public class SynchronizedSingleton{
    public static void main(String[] args){
        Thread t1 = new Thread (new Runnable(){//creating two threads
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
    public static country obj;//initializing the object and create within the getInstance() method
    private country(){
        System.out.println("there are 195 countries in the world");
    }
    public static synchronized country getInstance(){
        if(obj == null){
            obj = new country();
        }
        return obj;
    }
}

