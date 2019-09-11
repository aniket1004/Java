package MIString.MINotation;
import MIString.MIUpdater.NewString;

public class Notation extends NewString implements  INotation
{
	 public String MyStr(String str)
	{
		int i=0,j=0;
		char arr[ ]=str.toCharArray();
		
		for (i=0;i<arr.length;i++)
		{
			if (arr[i]!=' ')
			{
				if ((arr[i]>='a')&&(arr[i]<='z'))
				{
					arr[i]=Character.toUpperCase(arr[i]);
				}
				for (j=i;((j<arr.length)&&(arr[j]!=' '));j++)
				{
				}
				i=j-1;
			}
		}
		String nstr=new String (arr);
		return nstr;
	}
}