//KHUSHI DESAI
//21BCP264
public class Q11 
{
    public static void main(String args[]) 
    {
        Quadrilateral Q = new Quadrilateral();
        Quadrilateral P = new Parallelogram(); 
        Quadrilateral R = new Rhombus(); 
        Quadrilateral S = new Square(); 
        Q.getInfo();
        P.getInfo();
        R.getInfo();
        S.getInfo();

    }
}
class Quadrilateral 
{
    void getInfo() 
    {
        System.out.println("No. of sides in quadrilateral is: 4");
        System.out.println();
    }
}

class Parallelogram extends Quadrilateral 
{
    void getInfo() 
    {
        System.out.println("No. of sides in Parallelogram is: 4");
        System.out.println("opposites sides of parallelogram are parallel.");
        System.out.println();
    }
}

class Rhombus extends Quadrilateral 
{
    void getInfo() 
    {
        System.out.println("No. of sides in Rhombus is: 4");
        System.out.println("All sides of rhombus have same length.");
        System.out.println();
    }
}

class Square extends Quadrilateral 
{
    void getInfo() 
    {
        System.out.println("No. of sides in Square is: 4");
        System.out.println("All sides of square have same length.");
        System.out.println("All angles in square have 90 degree angle.");
    }
}
