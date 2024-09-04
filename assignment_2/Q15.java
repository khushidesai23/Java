package P1;
class A
{
    int add(int a, int b) 
    {
        return a+b;
    }

}
class B extends A
{
	int add(int a, int b)
	{
		return a+b;
	}
}
public class Q15

{
	public static void main(String[] args)
	{
		A ans = new A();
		System.out.println("the addition in A is: "+ans.add(3,2));
		
		ans = new B();
		System.out.println("the addition in B is: "+ans.add(3,5));	
	}
}



