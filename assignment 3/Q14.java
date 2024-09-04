//KHUSHI DESAI
//21BCP264

import java.lang.*;
public class Q14 extends Thread {

public void run(){
    System.out.println("Inside run method");
}

public static void main(String[] args){
    Q14 t1 = new Q14();
    Q14 t2 = new Q14();
    Q14 t3 = new Q14();

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.MAX_PRIORITY);
    t3.setPriority(8);

    System.out.println("t1 thread priority : "+ t1.getPriority());
    System.out.println("t2 thread priority : "+ t2.getPriority());
    System.out.println("t3 thread priority : "+ t3.getPriority());


    System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
    System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());

    Thread.currentThread().setPriority(10);
    System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
    }
}

