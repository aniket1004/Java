import java.lang.*;

class Overloading
{
	public void fun()
	{
		System.out.println("Fun ");
	}
	public void fun(int i)
	{
		System.out.println("Fun i ");
	}
	public void fun(int i,float f)
	{
		System.out.println("Fun i .f");
	}
	public void fun(float f ,int i)
	{
		System.out.println("Fun f.i ");
	}
}

class Over
{
	public static void main(String arg[ ])
	{
		int i=0;
		float f=0.0f;
		Overloading obj=new Overloading();
		obj.fun();
		obj.fun(i,f);
		obj.fun(f,i);
		obj.fun(i);
	}
}