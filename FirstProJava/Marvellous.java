
import  java.lang.*;

class  Arithmatic
{
	public int iNo1;
	public int iNo2;

	public  Arithmatic ()
	{
		this.iNo1=0;
		this.iNo2=0;	
	}	
	public  Arithmatic (int i,int j)
	{
		this.iNo1=i;
		this.iNo2=j;	
	}
	public  int Add()
	{
		return (iNo1+iNo2);
	}
}
class  Marvellous
{
	public static void main (String arg[ ])
	{
		System.out.println("Inside Main");
		Arithmatic obj1,obj2;
		obj1=new Arithmatic();
		obj1=new Arithmatic(11,22);

		int ans=obj1.Add();
		System.out.println(ans);
	}
}