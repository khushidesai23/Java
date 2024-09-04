//KHUSHI DESAI
//21BCP264
public class ReturningValues 
{
    int n1,n2;
    void values(int a,int b)
    {
        n1=a;
        n2=b;
    }
    int maximum()
    {
        int max=n1>n2?n1:n2;
        return max;
    }
    public static void main(String arg[])
    {
        ReturningValues R=new ReturningValues();
        R.values(420,69);
        System.out.println("Maximum among "+R.n1+" and "+R.n2+" is: "+R.maximum());
    }   
}
