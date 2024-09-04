package two;
import one.*;

public class Q15b extends one.Q15a
{
	public int add(int a, int b)
	{
		return a+b;
	}

	public static void main(String[] args)
	{
		one.Q15a ans = new one.Q15a();
		System.out.println("the addition in A is: "+ans.add(3,2));
		
		ans = new Q15b();
		System.out.println("the addition in B is: "+ans.add(3,5));	
	}
}

