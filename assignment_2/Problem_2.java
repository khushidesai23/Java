//KHUSHI DESAI
//21BCP264
import java.util.*;
class Distance
{
    int feet,inch;
    public Distance(int f,int i)
    {
        feet = f;
        inch = i;
    }
    public Distance(Distance d)
    {
        feet = d.feet;
        inch = d.inch;
    }
    public Distance()
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of feet and inch");
            feet = sc.nextInt();
            inch = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Distance : "+feet+" feet "+inch+" inch");
    }
    public void sum(Distance d3)
    {
        Distance temp = new Distance(feet,inch);
        temp.feet = feet + d3.feet;
        temp.inch = inch + d3.inch;
        if(temp.inch>=12)
        {
            temp.feet++;
            temp.inch-=12;
        }
        temp.display();
    }  
}
public class Problem_2 
{
    public static void main(String[] args) 
    {
        Distance d1 =  new Distance(6,11);
        d1.display();
        Distance d2 = new Distance();
        d2.sum(d1);
    }
}
