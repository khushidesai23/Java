//Khushi Desai
//21BCP264
import java.util.*;
public class median 
{
    public static void main(String args[])
    {
        int n1,n2;
        
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

        int c=arr1.length+arr2.length;
        int[] arr3=new int[c];

        for(int i=0; i<arr1.length; i++)
        {
            arr3[i]=arr1[i];
        }

        for(int i=0; i<arr2.length;i++)
        {
            arr3[arr1.length+i]=arr2[i];
        }
        
        int n=arr3.length;
        
        for (int i = 1; i < n; i++) 
        {
            for (int j = 0; j <= (n - 1 - i); j++) 
            {
                if (arr3[j] > arr3[j + 1]) 
                {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
                
                else 
                continue;
            }
        }
        for (int i=0; i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        
        double median;
        if(n%2==0)
        {
            median=(arr3[(n/2)-1]+arr3[(n/2)])*(0.5);
        }
        
        else 
        {
            median=arr3[n/2];
        }

        System.out.println("Median= "+median);

    }

}
