import java.util.*;

class  Demo <T>
{
	public T add(T no1,T no2)
	{
		T ans=no1+no2;
		return (ans);
	}
}
class Hello
{
	public static  void main(String rg[])
	{
		
		Demo <Integer> obj=new Demo<Integer>();
		Demo <Float>obj1=new Demo<Float>();
		
		System.out.print(obj1.add(10,20));
		System.out.print(obj.add(10,20));
	}
}
		