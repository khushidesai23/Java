//Khushi Desai
//21BCP264

//Write a program to show the use of nested try statements that emphasizes the sequence of checking for catch handler statements.

public class Q8_1 {
    public static void main(String[] args) {
        
        try {
            int[] a = {2,4,6,8};
            for(int i=0; i<5;i++){
                System.out.println(a[i]);
            }

            System.out.println("Division");
            int ans = 100 / 0;
            
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
    }
}
