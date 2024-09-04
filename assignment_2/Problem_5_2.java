//KHUSHI DESAI
//21BCP264
import java.util.Scanner;

class Info {
    private int age;
    public int marks;
    final int x = 10;

    public void SetData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        age = sc.nextInt();
        System.out.println("Enter your Marks : ");
        marks = sc.nextInt();
    }
    public void display(){
        System.out.println("Age: "+age+", Marks: "+marks+", X :"+x);
    }
    public void incr(int y){
        y++;
        System.err.println("Pass by value : "+y);
    }
    public void incr2(Info a){
        a.marks++;
        System.out.println("Pass by refrence : "+a.marks);
    }
}
public class Problem_5_2{
    public static void main(String[] args) {
        Info a1 = new Info();
        a1.SetData();
        a1.display();
        
        Info a2 = new Info();
        a2.SetData();
        a2.display();

        int y=8;
        System.out.println("Y = "+y);
        a1.incr(y);

        System.out.println("Marks :"+a1.marks);
        a1.incr2(a2);
    }
}