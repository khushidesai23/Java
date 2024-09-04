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
        System.out.println("Age : "+age+", Marks : "+marks+", X : "+x);
    }
}
public class Problem_5_1{
    public static void main(String[] args) {
        Info a1 = new Info();
        a1.SetData();
        a1.display();
        // Error as age variable is private 'If main class was in Info class then we change the age variable'
        // a1.age = 20;
        a1.marks = 98;
        // Error as x variable is declared as "final" 
        // a1.x = 10;
    }
}
