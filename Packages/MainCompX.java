import MIString.MICompare.Strcompare;
import java.util.Scanner;

class MainCompX 
{
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
		Strcompare obj=new Strcompare();
		
		System.out.println ("Enter First string");
		String str1=sobj.nextLine();

		System.out.println ("Enter Second string");
		String str2=sobj.nextLine();
		
		boolean bRet=obj.strCmpX(str1,str2);
		System.out.println ("StrCmp  "+bRet);		
		
		System.out.println ("Enter upto Size");
		int size=sobj.nextInt();

		bRet=obj.strnCmpX(str1,str2,size);
		System.out.println ("StrCmpX  "+bRet);		

		 bRet=obj.StartWith(str1,str2);
		System.out.println ("StartWith  "+bRet);		

		 bRet=obj.EndWith(str1,str2);
		System.out.println ("EndWith  "+bRet);

	}
}