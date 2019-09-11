package MIString.MIConcat;

public class StrConcat
{
	public String strCat (String str1,String str2)
	{
		char arr[ ]=new char [str1.length()+str2.length()];
		int i=0,j=0;
		
		for (i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}
		for (j=0;j<str2.length();j++,i++)
		{
			arr[i]=str2.charAt(j);
		}	
		return (new String(arr));
	}
	
	public String strnCat (String str1,String str2,int size)
	{
		if (size>str2.length())
		{
			return str2;
		}
		
		char arr[ ]=new char [str1.length()+size];
		int i=0,j=0;
		
		for (i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}
		for (j=0;j<size;j++,i++)
		{
			arr[i]=str2.charAt(j);
		}	
		return (new String(arr));
	}

	public String strSmallCat (String str1,String str2)
	{	
		char arr[ ]=new char [str1.length()+str2.length()];
		int i=0,j=0;
		
		for (i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}
		for (j=0;j<str2.length();j++)
		{
			if ((str2.charAt(j)>='a')&&(str2.charAt(j)<='z'))
			{
				arr[i]=str2.charAt(j);
				i++;
			}
		}	
		String nstr =new String (arr);
		nstr.trim();
		return (nstr);
	}

	public String strCapCat (String str1,String str2)
	{	
		char arr[ ]=new char [str1.length()+str2.length()];
		int i=0,j=0;
		
		for (i=0;i<str1.length();i++)
		{
			arr[i]=str1.charAt(i);
		}
		for (j=0;j<str2.length();j++)
		{
			if ((str2.charAt(j)>='A')&&(str2.charAt(j)<='Z'))
			{
				arr[i]=str2.charAt(j);
				i++;
			}
		}	
		String nstr =new String (arr);
		nstr.trim();
		return (nstr);
	}

	public String strInsert (String str1,String str2,int iPos )
	{	
		char arr[ ]=new char [str1.length()+str2.length()];
		int i=0,j=0;
		
		for (i=0;i<iPos;i++)
		{
			arr[i]=str1.charAt(i);
		}
		for (j=0;j<str2.length();j++,i++)
		{
			arr[i]=str2.charAt(j);
		}	
		for (j=iPos;j<str1.length();j++,i++)
		{
			arr[i]=str1.charAt(j);
		}
		String nstr =new String (arr);
		nstr.trim();
		return (nstr);
	}
}