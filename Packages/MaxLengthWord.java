
package MIString.WordCount;
import MIString.MIUpdater.NewString;


public  class MaxLengthWord 
{
	public int MaxLengthWord(String str)
	{
		NewString nobj=new NewString();
		str=nobj.RWS(str);
		String arr[ ]=str.split(" ");
		int max=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i].length()>max)
			{
				max=arr[i].length();
			}
		}

		return max;
	}
}
