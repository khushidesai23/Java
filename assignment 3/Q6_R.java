//KHUSHI DESAI
//21BCP264
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Q6_R
{
    public static void main(String[] args) throws IOException
    {
        int ch;
        FileReader fr=null;
        try
        {
            fr = new FileReader("P2.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
        fr.close();
    }
}

