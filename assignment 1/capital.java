//KHUSHI DESAI
//21BCP264
import java.util.*;
public class capital
{
public static void main(String args[]) 
{
    String s1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string... ");
    s1 = sc.nextLine();
    int count=0,i=0,n;
    n = s1.length();

     if ( null == s1 || s1.isEmpty())
     {
         System.out.println("Text empty");
     }
     else 
     { 
           if( Character.isUpperCase(s1.charAt(0) ))
           {
               count++;
           }
           for (i=1 ; i<n ; i++)
           {
               if (  Character.isWhitespace(s1.charAt(i-1)) && Character.isUpperCase(s1.charAt(i) ) )
                {
                   count++;
                }
           }  
         }

    System.out.println("Number of the word wich starts with capital latter... " + count );
}
}