import java.util.Scanner;
import MIString.MIUpdater.NewString;
import MIString.MIUpdater.StrUpdater;

class StringS
{
	public static void main (String arg[ ])
	{
		NewString str=new NewString();
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter string:");
		String Str=sobj.nextLine();
			
		String newstr=str.RWS(Str);
		System.out.println("Output "+newstr);
	}
}