//KHUSHI DESAI
//21BCP264
import java.lang.Math;
import java.util.*;
class Area
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);        
        System.out.println("Please select a choice: ");
        System.out.println("1: Triangle");
        System.out.println("2: Rectangle");
        System.out.println("3: Circle");
        System.out.println("4: Exit");

        Circle c = new Circle();
        Triangle t=new Triangle();
        Rectangle r=new Rectangle();


        System.out.print("choice: ");
        int choice=sc.nextInt();

        if(choice==1)
        {           
            t.area();
        }
        
        else if(choice==2)
        {
            r.area();
        }
        else if (choice==3)
        {
            c.area();
        }        
    }
}
abstract class Shape 
{
    abstract void area();
    double area;
}

class Triangle extends Shape 
{
    void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base length: ");
        float l=sc.nextFloat();
        System.out.print("Enter the height: ");
        float h=sc.nextFloat();
        area = (l*h)/2;
        System.out.println("area of Triangle: "+area);
    }
}

class Rectangle extends Shape 
{
    void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length: ");
        double l=sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double b=sc.nextDouble(); 

        area = l*b;
        System.out.println("area of Rectangle: "+area);
    }
}

class Circle extends Shape 
{
    
    void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius=sc.nextDouble();

        area = Math.PI * radius * radius;
        System.out.println("area of Circle: "+area);
    }
}

