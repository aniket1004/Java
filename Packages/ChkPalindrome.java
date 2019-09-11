	import MIString.MIChkPalindrome.Palindrome;
	import java.util.Scanner;

	class ChkPalindrome
	{
		public static void main (String arg [ ])
		{
			Scanner sobj =new Scanner (System.in);
			System.out.println ("Enter the string");
			String str=sobj.nextLine();
			
			Palindrome pobj=new Palindrome();
			pobj.Palindrome(str);
		}
	}
