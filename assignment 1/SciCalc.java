//Khushi Desai
//21BCP264

import java.util.*;
import java.lang.Math;
public class SciCalc 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice: '#' for root, 's' for sine, 't' for tan, 'p' for power, 'r' for radian");
        String str=sc.nextLine();

        char  ans=str.charAt(0);

        if(ans=='p')
        {
            System.out.println("Enter the number: ");
            double n = sc.nextDouble();

            System.out.println("Enter the power: ");
            double power = sc.nextDouble();

            System.out.println("value: "+ Math.pow(n,power));
        }

        else if(ans=='r')
        {
            System.out.println("Enter the degree: ");
            double d = sc.nextDouble();

            System.out.println("value: "+ Math.toRadians(d));
        }

        else if(ans=='t')
        {
            System.out.println("Enter the angle: ");
            double n = sc.nextDouble();

            System.out.println("value: "+ Math.tan(n));
        }
        
        else if(ans=='s')
        {
            System.out.println("Enter the angle: ");
            double s = sc.nextDouble();

            System.out.println("value: "+ Math.sin(s));
        }

        else if(ans=='#')
        {
            System.out.println("Enter the number: ");
            double n = sc.nextDouble();

            System.out.println("value: "+ Math.sqrt(n));
        }
    }
}
