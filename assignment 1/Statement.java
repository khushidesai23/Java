//KHUSHI DESAI
//21BCP264

import java.util.*;
public class Statement 

{
    public static void main(String[] args)
    {
        int vow=0, con=0,i;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the statement: ");
        String s=sc.nextLine();

        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
            vow++;
            
            else if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
            con++;
        }
        System.out.println("Number of vowels: " + vow);    
        System.out.println("Number of consonants: " + con); 
    }

}
