import java.lang.*;

final class Demo
{
	public void fun()
	{
		System.out.println("Demo fun");
	}
	
	public void gun()
	{
		System.out.println("Demo gun");
	}
}

class FinalX
{
	final public int i=10;
	final public int j;
	final public int k;
	final public int l=10;
	public FinalX()
	{
		System.out.println("Constructor");

		j=10;
	}

	{
		System.out.println("Unnamed");
		k=20;
	}
	static
	{
		System.out.println("Static");
	}
	public Demo dobj=new Demo();
	
	public void fun()
	{
		System.out.println("FinalX fun");
	}
}

class Final
{
	public static void main(String arg[ ])
	{
		FinalX fobj=new FinalX();
		FinalX fobj1=new FinalX();

		fobj.fun();
		fobj.dobj.fun();
	}
}