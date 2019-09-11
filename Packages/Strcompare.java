
package MIString.MICompare;

public class  Strcompare implements ICompare
{
	public boolean strCmpX(String str1 ,String str2)
	{
		if (str1.length()!=str2.length())
		{
			return false;
		}
		int i;
		for ( i=0;i<str1.length();i++)
		{
			if (str1.charAt(i)!=str2.charAt(i))
			{		
				break;
			}
		}
		if (i==str1.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean strnCmpX(String str1 ,String str2,int size)
	{
		if (str2.length()<size)
		{
			return false;
		}
		int i;
		for ( i=0;i<size;i++)
		{
			if (str1.charAt(i)!=str2.charAt(i))
			{
				break;
			}
		}
		if (i==size)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean StartWith(String str1 ,String str2)
	{
		if  (str1.length()<str2.length())
		{
			return false;
		}
		int i;
		for ( i=0;i<str2.length();i++)
		{
			if (str1.charAt(i)!=str2.charAt(i))
			{
				break;
			}
		}
		if (i==str2.length())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public boolean EndWith(String str1 ,String str2)
	{
		if  (str1.length()<str2.length())
		{
			return false;
		}
		int i;
		for ( i=str1.length()-str2.length();i<str1.length();i++)
		{
			if (str1.charAt(i)!=str2.charAt(i))
			{
				break;
			}
		}
		if (i==str1.length())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}