//KHUSHI DESAI
//21BCP264
import java.io.*; 
import java.util.HashSet; 
import java.util.Set;
public class Q3
{ 
    public static void main(String[] args) throws IOException  
    {
        FileWriter fw = new FileWriter("output.txt"); 
        BufferedReader br = new BufferedReader(new FileReader("duplicate.txt")); 
          
        String line = br.readLine(); 

        Set hs = new HashSet(); 

        while(line != null) 
        { 
            if(hs.add(line)) 
                fw.append(line+"\n"); 
              
            line = br.readLine();    
        } 
          
        fw.flush(); 
        br.close(); 
        fw.close(); 
          
        System.out.println("File operation performed successfully"); 
    } 
} 