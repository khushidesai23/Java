//Khushi Desai
//21BCP264
import java.util.*;
public class Parentheses
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string: ");
        String str=sc.nextLine();
        int flag=0;
        
        char arr[]=new char[str.length()];

        for(int i=0; i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }

        for(int i=0;i<=str.length()-1; i++)
        {
            if (arr[i]=='(')
            {
                if(arr[i+1]==')')
                    flag=1;
                    
                else 
                    flag=0;
               
            }

           else if (arr[i]=='[')
            {
                if(arr[i+1]==']')
                    flag=1;
                    
                else 
                    flag=0;
                
            }
        
            else if (arr[i]=='{')
            {
                if(arr[i+1]=='}')
                    flag=1;
                    
                else 
                    flag=0;
                
            }
           
        }

        if(flag==1)
            System.out.println("true");
        else
            System.out.println("flase");

    }
}