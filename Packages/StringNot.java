import java.util.Scanner;
import MIString.MINotation.INotation;
import MIString.MINotation.Notation;

class StringNot
{
	public static void main (String arg[ ])
	{
		Notation nobj=new Notation();
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter string:");
		String Str=sobj.nextLine();
			
		String newstr=nobj.RWS(Str);
		System.out.println("Output "+newstr);
		newstr=nobj.MyStr(Str);
		System.out.println("Notation "+newstr);
	}
}