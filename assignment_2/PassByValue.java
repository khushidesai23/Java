//KHUSHI DESAI
//21BCP264
public class PassByValue 
{
    String s="OOP";

    void display(String s)
    {
        s="Java";
    }
    public static void main(String args[])
    {
        PassByValue p = new PassByValue();
        System.out.println("Before : "+p.s);
        p.display("hello");
        System.out.println("After : "+p.s);
    }
}
