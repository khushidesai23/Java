//Khushi Desai
//21BCP264
import java.util.*;
public class palindrome 
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        num = sc.nextInt();
        String s = String.valueOf(num);
        char arr[]=new char[s.length()];
        
        int flag=0;
        for (int i=0;i<s.length(); i++)
        {
            arr[i]=s.charAt(i);
        }
                
        for(int i=0; i<=s.length()-1; i++)
        {
            for(int j=s.length()-1; j>=0; j--)
            {
                if (arr[i]==arr[j])
                    flag=1;
                else 
                    flag=0;
            }
        }
        if (flag==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
