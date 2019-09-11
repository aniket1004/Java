package MIString.MIUpdater;

public class NewString extends  StrUpdater
{
	public String RWS(String Str)
	{
		char brr[ ]=Str.toCharArray();
		char arr[ ]=new char[brr.length];
		int i=0,j=0,k=0;
		
		for (i=0;i<brr.length;i++)
		{
			if (brr[i]==' ')
			{
				for (j=i;((j<brr.length)&&(brr[j]==' '));j++)
				{
				}
				if ((j!=brr.length)&&(k!=0))
				{
					arr[k]=' ';
					k++;
				}
				i=j-1;
			}
			else if (brr[i]!=' ')
			{	
				for (j=i;((j<brr.length)&&(brr[j]!=' '));j++)
				{
					arr[k]=brr[j];
					k++;
				}
				
				i=j-1;
			}
		}
		
		char crr[ ]=new char[k];
		for (int x=0;x<k;x++)
		{
			crr[x]=arr[x];
		}	

		String NewStr=new String(crr);
		return NewStr;
	}
}
		