
class Student{
    int age;
    String name;
    int RollNo;

    public Student(String s,int a){
        age = a;
        name = s;
    }
    public Student(String s,int a,int Roll){
        age = a;
        name = s;
        RollNo = Roll;
    }
    public Student(Student s){
        age = s.age;
        name = s.name;
        RollNo = s.RollNo;
    }
    void display(){
    System.out.println("Name:"+name+" Age:"+age+" Roll Number:"+RollNo);
}
}
public class Problem_4 {
    public static void main(String[] args) { 
        Student s1 = new Student("Dev",18,8);
        System.out.println("Printing Overloading Constructor");
        s1.display();
        Student s2 = new Student(s1);
        System.out.println("Printing Copy Constructor");
        s2.display();
    }
}