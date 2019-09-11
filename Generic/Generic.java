import  java.lang.*;

class Generic
{
	public static <T> void Display (T arr[ ])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main (String arg[ ])
	{
		Integer iArr[ ]={10,20,30};
		Double farr[ ]={1.0,2.0,3.0};
		Display(iArr);
		Display(farr);
	}
}