import java.util.Scanner;

class NString
{

	public int wordCount(String str)
	{
		int iCnt=0,i=0,j=0;
		char arr[ ]=str.toCharArray();
		
		for (i=0;i<arr.length;i++)
		{
			if (arr[i]==' ')
			{
				for (j=i;((j<arr.length)&&(arr[j]==' '));j++)
				{
				}
				i=j-1;
			}
			else if (arr[i]!=' ')
			{
				iCnt++;
				for (j=i;((j<arr.length)&&(arr[j]!=' '));j++)
				{
				}
				i=j-1;
			}
		}
		return iCnt; 
	}
}
class NewString
{
	public static void main (String arg[ ])
	{
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter string");
		String str=sobj.nextLine();

		NString strobj=new NString();
		int iRet=strobj.wordCount(str);
		
		System.out.println("Number of words are"+iRet);
	}
}				