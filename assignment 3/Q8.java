//Khushi Desai
//21BCP264

public class Q8 {
    public static void main(String[] args) {
        //first try block
        try {
            int[] a = {2,4,6,8};
            for(int i=0; i<a.length;i++){
                System.out.println(a[i]);
            }
            
            System.out.println(a[10]);
           
            //second try block
            try {
                System.out.println("Division");
                int ans = 100 / 0;

            } catch (ArithmeticException ex2) {
                System.out.println("Sorry! Division by zero isn't feasible!");
            }
        } catch (ArrayIndexOutOfBoundsException ex1) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
