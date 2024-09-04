//Khushi Desai
//21BCP264

import java.util.*;
public class Prime1 {
        public static void main(String[] args) {
                int check, n = 0, i = 1, j;

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int n1 = sc.nextInt();
                System.out.println("First " + n1 + " prime numbers are as bellow");
                while (n < n1) {
                    j = 1;
                    check = 0;

                    while (j <= i) {
                        if (i % j == 0)
                           check++;
                           j++;
                    }

                    if (check == 2) {
                        System.out.println(i);
                        n++;
                    }
                    i++;
                }
        }
}