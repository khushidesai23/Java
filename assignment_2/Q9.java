//Khushi Desai
//21BCP264
public class Q9 
{
	public static void main(String[] args) 
	{
		d obj=new d();
		System.out.println(obj.x);
		System.out.println("Here a-> b,a->d represent single inheritance");
		System.out.println("a->b->c represent mulltilevel inheritance");
		System.out.println("a->b&d represent hierarchical inheritance");
	}
}

class a
{
	int x;
	a()
	{
		this.x=5;
	}
	
}
class b extends a
{
	b()
	{
		this.x=x;
	}
}
class c extends b
{
	c()
	{
		this.x=x;
	}
	
}
class d extends a
{
	d()
	{
		this.x=x;
	}
}