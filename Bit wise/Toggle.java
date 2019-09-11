import java.lang.*;
import java.util.Scanner;

class Toggle
{	
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int no1=sobj.nextInt();	
	
		System.out.println("Enter range ");
		int iStart=sobj.nextInt();
		int iEnd=sobj.nextInt();

		unsigned int Mask=0xFFFFFFFF;
		
		/*Mask=Mask>>iStart-1;
		Mask=Mask<<(iEnd-iStart)-1;
		Mask=Mask>>32-iEnd;

		no1=no1^Mask;

		System.out.println("Modified number is"+no1);	
		*/
		System.out.println(Mask);	
	}
}