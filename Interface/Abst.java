import java.lang.*;

abstract class xyz
{
	{
		System.out.println("Inside unnamed xyz");
	}
	public abstract void fun();
	public abstract void gun();
	public  void sun()
	{
		System.out.println("Inside xyz sun");
	}
	public   void run()
	{
	}
}

 class abc extends xyz 
{
	{
		System.out.println("Inside unnamed abc");
	}

	public  void sun()
	{
		System.out.println("Inside abc sun");
	}
	public  void fun()
	{
		System.out.println("Inside fun");
	}

	public  void gun()
	{
		System.out.println("Inside gun");
	}
	public   void run()
	{
	}

}

class abst
{
	static
	{
		System.out.println("Inside static");
	}
	{
		System.out.println("Inside unnamed abst");
	}
	public static void main(String arg[ ])
	{
		abc a=new abc();
		xyz x=new abc();	
		
		a.sun();
		x.sun();
	}
}