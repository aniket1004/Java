import java.util.Scanner;

class SumArray
{
	static
	{
		System.out.println("Inside SumArray static");
	}
	public int arr[ ];
	
	public SumArray(int size)
	{
		arr=new int[size];
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);

		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element"+(i+1));
			arr[i]=sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("Elements of array are");
		for (int x:arr)
		{
			System.out.println(x);
		}
	}

	public int SumArray()
	{
		int sum=0;
		
		for (int i:arr)
		{
			sum+=i;
		}
		return sum;
	}				
}
			
		
class Array
{
	static
	{
		System.out.println("Here we perform problem on array");
	}	
	public static void main(String arg[])
	{
		SumArray obj;	//Reference
		int length;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter how many numbers");
		length=sobj.nextInt();

		obj=new SumArray(length);
	
		obj.Accept();
		obj.Display();

		int ans=obj.SumArray();
		System.out.println("Addition of array elements is");
		System.out.println(ans);

		obj=null;
	}
}		