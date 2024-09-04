class Assignment8
{
	public int x,y;
	public Assignment8()
	{
		this(10,20);
		this.disp();
		x=5;
		y=7;
		this.disp();
	}

	public Assignment8(int a, int b)
	{

		System.out.println("Parametrized Constructor called using default constructor");
		x = a;
		y = b;
	}

	public void disp()
	{
		System.out.println("x: " + x + " y: " + y);
	}

	public static void main(String args[])
	{

	Assignment8 a1 = new Assignment8();
	a1.disp();
	}


}