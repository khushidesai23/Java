//KHUSHI DESAI
//21BCP264
import java.util.*;
public class Area 
{
    static float circle (float a)
    {
                    
        System.out.println("area of circle: "+(3.14*Math.pow(a,2)));
        return 1;
    }
    
    static float square (float x) 
    {
        System.out.println("area of square: " + x * x);
        return 1;
    }
    
    static float triangle(float l, float h) 
    {
        System.out.println("area of traingle: " + l*h*(0.5));
        return 1;
    }
    static float rectangle(float l, float b) 
    {
        System.out.println("area of rectangle: " + l * b);
        return 1;
    }


    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Enter '1' to find area of circle");
        System.out.println("Enter '2' to find area of square");
        System.out.println("Enter '3' to find area of triangle");
        System.out.println("Enter '4' to find area of rectangle");

        System.out.print("choice: ");
        int choice=sc.nextInt();

        
        if (choice==1)
        {
            System.out.print("Enter the radius: ");
            float radius=sc.nextFloat();

            circle(radius);
        }

        else if(choice==2)
        {
            System.out.print("Enter the length: ");
            float l=sc.nextFloat();

            square(l);
        }
        
        else if(choice==3)
        {
            System.out.print("Enter the base length: ");
            float l=sc.nextFloat();
            System.out.print("Enter the height: ");
            float h=sc.nextFloat();            

            triangle(l,h);
        }
        else if(choice==4)
        {
            System.out.print("Enter the length: ");
            float l=sc.nextFloat();
            System.out.print("Enter the breadth: ");
            float b=sc.nextFloat();            

            rectangle(l,b);
        }

        
    }

}
