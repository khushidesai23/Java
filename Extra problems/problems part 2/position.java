//Khushi Desai
//21BCP264
import java.util.Scanner;

public class position 
{
    public static void main(String args[]) 
    {
        int i, j, n,target;
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        
        System.out.println("enter the elements: ");
        for (i = 0; i < n; i++) 
        {
            
            arr[i] = sc.nextInt();
            
        }
        
        for (i = 1; i < n; i++) 
        {
            for (j = 0; j <= (n - 1 - i); j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
                else 
                continue;
            }
        }

        int arr2[]=new int[]{-1, -1};
        int flag=0;
        int firstindex=0, lastindex=0;

        System.out.print("target= ");
        target= sc.nextInt();
        
        for(i=0; i<n;i++)
        {
            firstindex=i;
            if (target==arr[i])
                flag=1;
            else
                continue;
            break;
        }

        for(int k=i;k<n;k++)
        {
            if(target==arr[k])
                lastindex=k;

        }

        if(flag==1)
            System.out.println(firstindex+","+lastindex);

        else
            for(i=0; i<arr2.length;i++)
            System.out.print(arr2[i]+" ");

    }
}