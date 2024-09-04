//KHUSHI DESAI
//21BCP264
import java.util.*;

public class spPattern {
    public static void main(String args[]) {
        // string input
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();

        // number of lines input
        int n, i, j, x, y;

        System.out.println("enter the number of lines: ");
        n = sc.nextInt();
        x = str.length() - 1;
        y = Math.ceilDiv(n, x);

        String r = new String(new char[y]).replace("\0", str);
        // for pyramid

        for (i = 1; i <= n; i++)
            if (i % 2 == 0) {

                for (j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print(r.charAt((j - 1)) + " ");

                System.out.println();

            } else {

                for (j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print("* ");

                System.out.println();

            }
        // for reverse
        for (i = n - 1; i > 0; i--)
            if (i % 2 == 0) {

                for (j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print(r.charAt((j - 1)) + " ");

                System.out.println();

            } else {

                for (j = 1; j <= n - i; j++)
                    System.out.print(" ");

                for (j = 1; j <= i; j++)
                    System.out.print("* ");

                System.out.println();

            }
        sc.close();

    }

}