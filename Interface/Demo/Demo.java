import java.lang.*;

interface abc
{
	public int i=10;
	public void fun();
}

class xyz 
{
	public int i=20;
	public void fun()
	{
		System.out.println("Inside xyz fun");
	}
}
class pqr extends xyz implements abc
{
	 public void fun()
	{
		System.out.println("Inside pqr fun");
	}
}

class Demo
{
	public static void main(String arg[ ])
	{
		pqr pobj=new pqr();
		pobj.fun();
		System.out.println(abc.i);
	}
}	