//KHUSHI DESAI
//21BCP264

import java.util.Scanner;

public class tempCodeRunnerFile
{
    public static void main(String args[]) 
    {
        int i, j, n;
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
        
        System.out.print("Sorted array is: ");
        for (i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }

    }
}