//KHUSHI DESAI
//21BCP264
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number A: ");
        int d1 = sc.nextInt();
        System.out.println("enter number B: ");
        int d2 = sc.nextInt();
        try{
            
            int c = d1/d2;
            System.out.println("Division is: "+c);
            
        
        }
        catch(Exception e){
            System.out.println("Division by zero cannot be possible");
        }
        sc.close();
    }
    
}



