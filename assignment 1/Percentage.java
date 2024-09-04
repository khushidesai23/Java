//KHUSHI DESAI
//21BCP264

import java.util.*;
public class Percentage 
{
    public static void main(String[] args) 
    {
        int i,percentage,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("how many subjects you want?: ");
        int n=sc.nextInt();

        int[] arr=new int[50];

        System.out.println("enter the marks of each subject(out of 100): ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(i=0;i<n;i++)
        {
            sum += arr[i];
        }
        System.out.println("total =" +sum);
        
        percentage = (sum/n);
        System.out.println("Percentage= " +percentage +"%");
   
    }

}