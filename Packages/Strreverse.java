package MIString.MIUpdater;

public class Strreverse extends NewString
{
	public String Reverse(String str)
	{

		String nstr=super.RWS(str);
		char arr[ ]=nstr.toCharArray();
		char temp;
		int i=0,j=(nstr.length())-1;

		while (i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}	
		return (new String(arr));
	}
	
	public String Reverse(String str,int iStart,int iEnd)
	{
		char arr[ ]=str.toCharArray();
		char temp;

		while (iStart<iEnd)
		{
			temp=arr[iStart];
			arr[iStart]=arr[iEnd];
			arr[iEnd]=temp;
			iStart++;
			iEnd--;
		}	
		
		return(new String(arr));
	}
	
	public String Wordrev(String str)
	{
		String nstr=super.RWS(str);
		String arr[ ]=nstr.split(" ");
		StringBuffer op=new StringBuffer();
		for (int i=0;i<arr.length;i++)
		{
			StringBuffer sb=new StringBuffer(arr[i]);
			sb=sb.reverse();
			op=(op.append(" ")).append(sb);
		}
		return ((new String(op)).trim());			
	}
}	