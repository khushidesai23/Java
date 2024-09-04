//KHUSHI DESAI
//21BCP264
public class Q15
{
    public static void main(String[] args) 
    {
        Resourse resourse=new Resourse();
        Thread p=new Producer("P",resourse);
        Thread c=new Thread(new Consumer("C",resourse));
        p.start();
        c.start();
    }
}

class Resourse
{
    Boolean isproduced=false;
    int data;
    synchronized void put(int x) throws Exception
    {
        if(isproduced)
        {
            wait();
        }
        this.data = x;
        isproduced=true;
        notify();
        

    }
    synchronized int get() throws Exception
    {
        if(!isproduced)
        {
            wait();
        }
        isproduced=false;
        notify();
        return data;
    }
}

class Producer extends Thread
{
    String name;
    Resourse res;
    Producer(String name, Resourse res)
    {
        this.name=name;
        this.res=res;
    }
    public void run() //not mandatory
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                res.put(i);
                System.out.println("Produced = " + i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
        }
        finally
        {
            System.out.println("Producer finished the job.");
        }
    }
}

class Consumer implements Runnable
{
    String name;
    Resourse res;
    Consumer(String name, Resourse res)
    {
        this.name=name;
        this.res=res;
    }
    
    public void run()   //Mandatory
    {
        try
        {
            for(int i=0;i<10;i++)
            {
                System.out.println("Consumed = " + res.get());
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
        }
        finally
        {
            System.out.println("Consumer finished the job.");
        }
    }
}


