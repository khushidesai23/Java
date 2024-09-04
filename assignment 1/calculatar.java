import java.util.*;
public class calculatar
{
    public static void main(String[] args) 
    {
        float sum,diff,mul,div;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please, enter the first number: ");
        float n1=sc.nextFloat();
        System.out.print("Please, enter the second number: ");
        float n2=sc.nextFloat();


        sum=n1+n2;
        System.out.println("SUM of given two numbers: "+sum);

        diff=n1-n2;
        System.out.println("DIFFRENCE of given two numbers: "+diff);

        mul=n1*n2;
        System.out.println("MULTIPLICATION of given two numbers: "+mul);

        div=n1/n2;
        System.out.println("DIVISION of given two numberS: "+div);

    }
}
