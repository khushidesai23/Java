//KHUSHI DESAI
//21BCP264
import java.util.*;
public class Dist
{
	public static void main(String[] args) 
    {
		Distance d1 = new Distance(); 
        d1.getData();
	}
}

class Distance
{
	public double getData()
	{
	    Scanner sc= new Scanner(System.in);
	    double feet=0, inch=0;

	    System.out.println("Enter distance in metric system");
	    System.out.println("First \"Meters\" then \"Centimeters\"");
	    System.out.println("Meters:");
	    double m = sc.nextInt();
	    System.out.println("Centimeters:");
	    double cm = sc.nextInt();

	    feet = m*3.281;
	    inch = m*39.37;

	    System.out.println("Feets: " +feet + "\t Inches: " +inch);

	    return cm;
	}
}