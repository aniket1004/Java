import MIString.MIConcat.StrConcat;
import java.util.Scanner;

class MainXStr
{
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner (System.in);
		StrConcat obj=new StrConcat();
		
		System.out.println ("Enter First string");
		String str1=sobj.nextLine();

		System.out.println ("Enter Second string");
		String str2=sobj.nextLine();
		
		String nstr=obj.strCat(str1,str2);
		System.out.println ("Strcat  "+nstr);
		
		System.out.println ("Enter upto Size");
		int size=sobj.nextInt();

		nstr=obj.strnCat(str1,str2,size);
		System.out.println ("Strncat  "+nstr);

		 nstr=obj.strSmallCat(str1,str2);
		System.out.println ("StrSmallcat  "+nstr);

		 nstr=obj.strCapCat(str1,str2);
		System.out.println ("StrCapcat  "+nstr);

		System.out.println ("Enter Position");
		int iPos=sobj.nextInt();

		nstr=obj.strInsert(str1,str2,iPos);
		System.out.println ("strInsert  "+nstr);
	}
}