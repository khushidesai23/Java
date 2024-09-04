//KHUSHI DESAI
//21BCP264

import java.util.*;
public class StringPattern 
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string: ");
        String n = sc.nextLine();

        for(i=1;i<=n.length();i++)
        {
            for(j=1;j<=n.length()-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(n.charAt(j-1)+" ");
            }System.out.println();
        }   
    }
}
