
 class Student 
{
    protected String Name;
    protected String RollNo;
    public Student()
        {
            RollNo = "0";
            Name = "Not set";
        }
    public Student(String a , String b)
    {
        RollNo = a;
        Name = b;
    }
}

 class Eng extends Student
{
    String Branch;

    public Eng()
    {
        Branch = "Not Set";
    }
    public Eng(String a, String b, String c){
        super(a,b);
        Branch = c;
    }
    public void display(){
        System.out.println(Name+"\n"+RollNo+"\n"+Branch);
    }
}
public class Problem_3{
    public static void main(String[] args) {
        System.out.println("Default Constructor :");
        Eng e1 = new Eng();
        e1.display();

        System.out.println("Paremeterized Constructor :");
        Eng e2 = new Eng("Dev","10","CSE");
        System.out.println(" Name :"+e2.Name+"\n Roll No : "+e2.RollNo+"\n Branch :"+e2.Branch);
    }
}
