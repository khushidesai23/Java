//KHUSHI DESAI
//21BCP264
public class Q6 
{
    public static void var(String...s1)
    {
        System.out.println("number of arguments: "+s1.length);
        
        System.out.println("Arguments are: ");
        for(String s:s1)
        {
            System.out.print(s+" ");
        }
    }
    public static void main(String args[])
    {
        var("A","B","C");
        var();
        var("x","y");
    }
    
}
