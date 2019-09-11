import java.lang.*;
import java.util.Scanner;

class Bitwise
{
	public static void main(String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		int no1=0,no2=0,ans=0,mask=0xFFFF0000;

		System.out.println("Enter two numbers");
		no1=sobj.nextInt();
		no2=sobj.nextInt();
				
		no1=no1&mask;
		mask=mask>>16;
		no2=no2&mask;
	
		ans=no1|no2;

		System.out.println("Modified number is"+ans+".");
	}
}
