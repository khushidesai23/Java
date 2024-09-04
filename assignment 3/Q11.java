//KHUSHI DESAI
//21BCP264
import java.util.*;
public class Q11 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 56, 4, 3, 23, 5, 4, 54, 56, 34 };

        try{

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else
                    continue;
            }
        }

        System.out.println("sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("which element you want to search?: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();

        int low = 0, mid = 0, high;
        high = arr.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == element) {
                break;
            }
            if (arr[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Binary search: the element " + element + " is found at position " + (mid + 1));
    }
    catch(ArrayIndexOutOfBoundsException ae){
        System.out.println("ArrayIndexOutOfBoundsException");
    }
    }
}