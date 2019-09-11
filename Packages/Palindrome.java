
	//Check Palindrome
	package MIString.MIChkPalindrome;
	import java.util.Scanner;

	public class Palindrome
	{
		public void Palindrome (String str)
		{
			StringBuffer sb=new StringBuffer(str);
			sb=sb.reverse();
			String temp=sb.toString();
			if (temp.equalsIgnoreCase(str))
			{
				System.out.println ("String is Palindrome");
			}
			else
			{
				System.out.println ("String is not Palindrome");
			}		
		}
	}
	