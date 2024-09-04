import java.io.*;

public class Problem1 {
    public static void main(String[] args) 
    throws IOException{
        File file = new File("C:\\Users\\Khushi Desai\\Documents\\PDPU\\SEM 3\\Java\\assignment 3\\p1.txt");
    
        BufferedReader reader = new BufferedReader(new FileReader(file));

        
        int wordCount = 0; 
        int characterCount = 0; 
        int paraCount = 0; 
        int whiteSpace = 0; 
        int sentence = 0; 

        //reading the first line into current line
        String currentLine = reader.readLine();
        
        while (currentLine != null) { 
             
            paraCount++;
            
            
            //getting number of words in current line
            String words[] = currentLine.split(""); 
            //updatind the word count
            wordCount += words.length; 
            
            for(String word:words)
            {
                characterCount += word.length(); 
            }

            currentLine = reader.readLine();

                whiteSpace += wordCount - 1; 
                String s[] = currentLine.split(""); 
                sentence += s.length; 
            } 
        
        
        System.out.println("Total word count = "+ wordCount); 
        System.out.println("Total number of sentences = "+ sentence); 
        System.out.println("Total number of characters = "+ characterCount); 
        System.out.println("Number of paragraphs = "+ paraCount); 
        System.out.println("Total number of whitespaces = "+ whiteSpace); 
    } 
}