//KHUSHI DESAI
//21BCP264
public class Q12 {
    public static void main(String[] args) 
    {
     System.out.println("Hello from Main"); 
     MyThread mt1 = new MyThread(500,"HELLO");
     MyThread mt2 = new MyThread(1000,"Good Evening");
     
     mt1.start();
     mt2.start();
    }
}

class MyThread extends Thread{

    int sleeptime;
    String msg;
    MyThread(int a, String m)
    {
        sleeptime=a;
        msg=m;
    }
    public MyThread() {
    }
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(this.getName()+" :"+i+" :"+msg);

            try{
                Thread.sleep(sleeptime);
            }

            catch(InterruptedException ex){

            }
        }
    }
    
}
