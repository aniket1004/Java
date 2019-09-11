package MIString.WordCount;
import MIString.MIUpdater.NewString;


public  class CountWord 
{
	public int CountWord(String str)
	{
		NewString nobj=new NewString();
		str=nobj.RWS(str);
		String arr[ ]=str.split(" ");
		return arr.length;
	}
}
