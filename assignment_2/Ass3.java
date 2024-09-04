public class Ass3{
	public static void main(String args[]){
		System.out.println("Default Constructor");
		EStud e1 = new EStud();
		e1.disp();

		System.out.println("Parameterized Constructor");
		EStud e2 = new EStud(10, "Mahek", "CSE");
		e2.disp();

	}
}
class Student{
	protected int rno;
	protected String name;
	
	public Student(){
	   rno = 0;
	   name = "Not Set";
	}
	
	public Student(int r, String n){
	   rno = r;
	   name = n;
	}
}

class EStud extends Student{
	public String branch;
	public EStud(){
	  branch = "Not Set";
	}

	public EStud(int r, String n, String b){
	    super(r,n);
	    branch = b;
	}

	public void disp(){
	    System.out.println("Roll no."+ rno + "\n" + "Name: " + name + "\n" + "Branch: " + branch);
	}
}