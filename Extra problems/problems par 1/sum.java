//KHUSHI DESAI
//21BCP264
import java.util.*;
public class sum 
{
    public static void main(String args[])
    {
        int nums[]={2,7,11,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of target: ");
        int target = sc.nextInt();
        
        for(int i=0; i<=nums.length-1;i++)
        {
            for(int j=i+1; j<=nums.length-1; j++)
            {
                int sum = nums[i]+nums[j];
                if (sum==target)
                {
                    System.out.print("["+i+","+j+"]");
                    System.out.println();
                }
                else
                continue;
            }  
            
        }
        
    }
}
