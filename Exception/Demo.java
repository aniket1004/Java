import java.util.Scanner;

class AgeInvalid extends Exception
{
	public AgeInvalid()
	{
		super();
	}
	
	public AgeInvalid(String str)
	{
		super(str);	
	}
}

class Demo
{
	public static void main(String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println ("Enter age ");
		int age=sobj.nextInt();
		
		try
		{
			if (age<18)
			{
				 AgeInvalid obj=new AgeInvalid("minor");
				throw obj;
			}
			System.out.println ("Age is valid");
		}
		
		catch (AgeInvalid aobj)
		{
			System.out.println ("Your age is less than 18");
		}
	}
}
		