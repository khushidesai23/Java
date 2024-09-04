//KHUSHI DESAI
//21BCP264
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void getinfo() throws IOException{
        FileInputStream inp = new FileInputStream("new.txt");
        int i=0;
        while((i= inp.read())!= -1){
            System.out.print((char)i);
        }
        inp.close();
    }
    public static void addinfo() throws IOException{
        FileOutputStream out= new FileOutputStream("new.txt", true);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();

        System.out.println("Enter the Roll Number: ");
        String Roll= sc.nextLine();

        System.out.println("Enter the age: ");
        String age = sc.nextLine();

        System.out.println("Enter the Branch: ");
        String branch= sc.nextLine();

        String str = "\nNAME: "+name+" ,Roll NO.: "+Roll+" ,Age: "+age+" ,Branch :"+branch; 
        byte b[] = str.getBytes();
        out.write(b);
        out.close();
        System.out.println("Entered Succesfully");


    }

    public static void main(String[] args) throws IOException {
       int select;
       boolean check = true;

       do{
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a choice \n1. ADD INFO \n2. SHOW INFO \n3. EXIT");
        select= sc.nextInt();

        switch(select){
            case 1: {
                addinfo();
                break;
            }
            case 2: {
                getinfo();
                break;
            }
            case 3:{
                check = false;
                break;
            }
            default:{
                System.out.println("!!Please Enter a valid choice!!");
            }
        }
       }
       while(check);

    }
}

