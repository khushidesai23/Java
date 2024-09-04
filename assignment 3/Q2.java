//KHUSHI DESAI
//21BCP264
import java.io.*;
public class Q2 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("p1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("capital.txt");
        PrintWriter pw = new PrintWriter(fw);
        String s1, s2;
        int i = 1;
        s1 = br.readLine();
        while (s1 != null) {
            String str = s1.toUpperCase();
            s2 = i + " " + str;
            pw.println(s2);
            s1 = br.readLine();
            i++;
        }
        pw.flush();
        pw.close();
        fw.close();
        fr.close();
        br.close();

    }

}