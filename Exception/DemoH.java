import java.util.Scanner;

class Hello extends Exception
{
	public void fun() throws ArithmeticException
	{
		int ans=15/0;
	}
}

class DemoH
{
	public static void main (String arg [ ])
	{
		Hello hobj=new Hello();
		try
		{
			hobj.fun();
		}
		catch (ArithmeticException obj)
		{
			System.out.println ("Cannot divided by 0");
		}
	}
}