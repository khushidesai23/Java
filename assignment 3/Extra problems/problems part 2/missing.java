//Khushi Desai
//21BCP264
import java.util.Scanner;

public class missing 
{
    public static void main(String args[]) 
    {
        int n, x = 0, y = 0;
        int arr1[] = new int[5*(10^5)];

        for(int i=0; i<=5*(10^5)-1;i++)
        {
            arr1[i]=i+1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:  ");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 1; i < n; i++) 
        {
            for (int j = 0; j <= (n - 1 - i); j++) 
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

        int pos[] = new int[100];

        for (int i = 0; i < n; i++) 
        {

            if (arr[i] <= 0)
                x++;
            pos[i] = arr[i];

            if (arr[i] > 0)
                y++;
        }

        for (int i = 0; i < y; i++) 
        {
            if (pos[x + y - 1] == arr1[y - 1]) 
            {
                System.out.println("the smallest missing element is: " + arr1[y]);
                break;
            } 
            else if (pos[x + i] == arr1[i]) 
            {
                continue;
            } 
            else 
            {
                System.out.println("the smallest missing element is: " + arr1[i]);
            }
            break;

        }
    }
}