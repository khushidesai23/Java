//KHUSHI DESAI
//21BCP264
import java.io.FileWriter;
import java.io.IOException;
public class Q6_W 
{
    public static void main(String[] args) throws IOException
    {
       
        String str = "File Handling in Java using "+" FileWriter and FileReader";
 
        
        FileWriter fw=new FileWriter("P2.txt");
 
        
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
 
        System.out.println("Writing successful");
        
        fw.close();
    }
}

