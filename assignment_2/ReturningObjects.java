//KHUSHI DESAI
//21BCP264
public class ReturningObjects 
{
    int n1,n2;
    ReturningObjects(int a,int b)
    {
        n1=a;
        n2=b;
    }
    ReturningObjects minNumber()
    {
        ReturningObjects min=new ReturningObjects(45,20);
        return min;
    }
    public static void main(String arg[])
    {
        ReturningObjects R1=new ReturningObjects(420,69);
        ReturningObjects R2=R1.minNumber();
    
        int minR1=R1.n1<R1.n2?R1.n1:R1.n2;
        System.out.println("Minimum among "+R1.n1+" & "+R1.n2+" is "+minR1);
        int minR2=R2.n1<R2.n2?R2.n1:R2.n2;
        System.out.println("Minimum among "+R2.n1+" & "+R2.n2+" is "+minR2);
    }
}
