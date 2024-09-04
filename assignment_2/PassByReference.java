//KHUSHI DESAI
//21BCP264
public class PassByReference 
{
    String s="OOP";

    void display(PassByReference p)
    {
        s="Java";
    }
    public static void main(String args[])
    {
        PassByReference p=new PassByReference();
        System.out.println("Before : "+p.s);
        p.display(p);
        System.out.println("After : "+p.s);
    }
}
