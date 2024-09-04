//KHUSHI DESAI
//21BCP264
import java.util.Scanner;

public class Q3
{
	public static void main(String[] args)
	{
        Employee e1 = new Employee("Khushi", 24);
        e1.show("Employee");
        
        Teacher t1 = new Teacher("Payal", 29, "OOPC");
        t1.display();
	}
}

class Employee
{
    String ename;
    int age;
    
    Employee(String name, int a) {
        ename = name;
        age = a;
    }
    
    public void show(String type) {
        System.out.println("Name of " +type + ": " +ename);
        System.out.println("Age of " +type + ": " +age );
    }
}

class Teacher extends Employee
{
    String subject;
    
	Teacher(String name,int age, String sub)
	{
		super(name,age);
		subject = sub;
	}
	
	public void display() {
	    show("Teacher");
	    System.out.println("Subject of Teacher: " + subject);
	}
}
