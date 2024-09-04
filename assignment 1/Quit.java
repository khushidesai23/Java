//KHUSHI DESAI
//21BCP264
import java.util.*;
public class Quit 
{
    public static void main(String args[]) 
    {

        int i, a = 0, b = 0;
        char x;
        while (true) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string: ");
            String str=sc.nextLine();
            
            if (str.equals("quit")) 
            {
                break;
            } 
            else 
            {
                for (i = 0; i < str.length(); i++) 
                {
                    x = str.charAt(i);
                    if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                        a++;
                    else
                        b++;
                }
                System.out.println("total number of vowels: " + a);
                System.out.println("total number of consonants: " + b);

            }

        }
    }
}