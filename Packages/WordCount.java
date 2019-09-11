import java.lang.*;
import java.util.Scanner;
import MIString.MIUpdater.NewString;
import MIString.WordCount.CountWord;
import MIString.WordCount.MaxLengthWord;

class WordCount
{
	public static void main (String arg [ ])
	{
		CountWord obj=new CountWord();
		MaxLengthWord mobj=new MaxLengthWord();
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter the string");
		String str=sobj.nextLine();
		int iRet=obj.CountWord(str);
		System.out.println("Number of words are "+iRet);
		iRet=mobj.MaxLengthWord(str);
		System.out.println("Maximum length of words are "+iRet);
	}
}