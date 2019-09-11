package MIString.MICompare;

public interface ICompare
{
	public boolean strCmpX(String str1 ,String str2);
	public boolean strnCmpX(String str1 ,String str2,int size);
	public boolean StartWith(String str1 ,String str2);
	public boolean EndWith(String str1 ,String str2);
}