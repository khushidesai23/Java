import java.io.*;

public class FileR {
    public static void main(String[] args){
    
        FileReader fr = null;
        BufferedReader br = null;

        try{
        
        int paraCount=0;
        fr = new FileReader("p1.txt");
        br = new BufferedReader(fr);
        String s =br.readLine();
        while(s!=null){
            paraCount++;
            System.out.println(s);
            s=br.readLine();
        }

        System.out.println("paragraph count= "+paraCount);
        br.close();
        fr.close();

        }

        catch(Exception e){
            System.out.println("file error"+e);
        }

    }
}