import MIString.MIUpdater.Strreverse;
import java.util.Scanner;

class MainStrX 
{
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		Strreverse obj=new Strreverse();
		
		System.out.println("Enter string");
		String str=sobj.nextLine();
		
		String str1=obj.Reverse(str);
		System.out.println("Reverse string1 is "+str1);
	
		String str2=obj.Reverse(str,0,4);
		System.out.println("Reverse string2 is "+str2);
		
		String str3=obj.Wordrev(str);
		System.out.println("Reverse string3 is "+str3);
	}
}