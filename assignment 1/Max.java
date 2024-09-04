import java.util.*;

public class Max 
{
    public static void main(String args[]) 
    {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        a = sc.nextInt();
        
        System.out.println("Enter number 2:");
        b = sc.nextInt();
     
        System.out.println("Enter number 3:");
        c = sc.nextInt();

        int d = (a > b && a > c) ? (a) : (b > c) ? (b) : (c);
        System.out.println("the greatest number is: " + d);
    }
}