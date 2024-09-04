//Khushi Desai
//21BCP264
import java.util.*;
public class reverseSum 
{
    public static void main(String args[])
    {
        int num1,num2,k=0,l=0;
        int n1,n2;  
        String str1 ="";
        String str2 ="";

        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store in array1: ");  
        n1=sc.nextInt();  
        int[] arr1 = new int[n1];  

        System.out.println("Enter the elements of the array1: ");  

        for(int i=0; i<n1; i++)  
        
        { 
            arr1[i]=sc.nextInt();  
        }  
        
        
        System.out.print("Enter the number of elements you want to store in array2: ");  
        n2=sc.nextInt();
        int[] arr2 = new int[n2];  

        System.out.println("Enter the elements of the array2: ");  

        for(int i=0; i<n2; i++)  
        { 
            arr2[i]=sc.nextInt();  
        }
      
        
        while (k<=arr1.length-1)
        {
          
            str1=str1+arr1[k];
            
            k++;
        }
        num1 = Integer.parseInt(str1);

        while (l<=arr2.length-1)
        {
            
            str2=str2+arr2[l];
            
            l++;
        }
        num2 = Integer.parseInt(str2);
        
        int sum=num2+num1;

        String s = String.valueOf(sum);
        char arr[]=new char[s.length()];
        System.out.println("Output: ");
        for (int i=s.length()-1;i>=0; i--)
        {
            arr[i]=s.charAt(i);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
