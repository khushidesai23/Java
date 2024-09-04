//KHUSHI DESAI
//21BCP264
import java.io.*;
public class Q1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;

        int paraCount = 0, wordCount = 0, sentenceCount = 0, spaceCount = 0, chCount=0;
        fr = new FileReader("p1.txt");
        br = new BufferedReader(fr);
        String currentLine = br.readLine();

        while (currentLine != null) {

            paraCount++;

            System.out.println(currentLine);
            for (int i = 0; i < currentLine.length(); i++) {
                chCount++;
                if (currentLine.charAt(i) == '?' || currentLine.charAt(i) == '.' || currentLine.charAt(i) == '!'
                        || currentLine.charAt(i) == ' ') {
                    wordCount++;
                }

                if (currentLine.charAt(i) == '?' || currentLine.charAt(i) == '.' || currentLine.charAt(i) == '!') {
                    sentenceCount++;
                }

                if (currentLine.charAt(i) == ' ') {
                    spaceCount++;
                }
            }

            for (int i = 1; i < currentLine.length(); i++) {

                if ((currentLine.charAt(i - 1) == '?' || currentLine.charAt(i - 1) == '.'
                        || currentLine.charAt(i - 1) == '!') && currentLine.charAt(i) == ' ') {
                    wordCount--;
                }

            }

            currentLine = br.readLine();
        }

        System.out.println("paragraph count= " + paraCount);
        System.out.println("word count: " + wordCount);
        System.out.println("sentence count: " + sentenceCount);
        System.out.println("space count: " + spaceCount);
        System.out.println("character count: "+chCount);

        fr.close();
        br.close();
    }

}