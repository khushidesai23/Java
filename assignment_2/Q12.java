//KHUSHI DESAI
//21BCP264
import java.util.Scanner;
public class Q12
{
    public static void main(String[] args)
    {
        System.out.println("Enter the 1st String:");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter the 2nd String:");
        String s2=sc.nextLine();
        s1.toLowerCase();
        s2.toLowerCase();
        char arr1[]=new char[s1.length()];
        char arr2[]=new char[s2.length()];
        for(int i=0;i<s1.length();i++)
        {
            arr1[i]=s1.charAt(i);
        }
        int i;
        for(i=0;i<s2.length();i++)
        {
            arr2[i]=s2.charAt(i);
        }
        if(s1.length()==s2.length())
        {
            int count=0;
            for(int k=0;k<s1.length();k++)
            {
                if(arr1[k]==arr2[s2.length()-1-k])
                    count=0;
                else
                    count=1;
            }
            if(count>0)
                System.out.println("The Strings are not rotation of each other");
            else
                System.out.println("The Strings are rotation of each other");
        }
        else
            System.out.println("The Strings are not rotation of each other.");
    }


}