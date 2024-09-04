//KHUSHI DESAI
//21BCP264

public class Q13 {
    public static void main(String[] args) 
    {
     System.out.println("Hello from Main"); 
     MyThread mt1 = new MyThread(500,"HELLO");
     Thread nt1=new Thread(mt1);
     MyThread mt2 = new MyThread(1000,"Good Evening");
     Thread nt2=new Thread(mt2);
    
     nt1.start();
     nt2.start();
    }
}

class MyThread implements Runnable{
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
            System.out.println(i+" :"+msg);

            try{
                Thread.sleep(sleeptime);
            }

            catch(InterruptedException ex){

            }
        }
    }
    
}
