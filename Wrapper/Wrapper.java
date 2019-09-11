import java.lang.*;

class Wrapper
{
    public static void main(String arg[ ])
    {
        	char ch1='M';
        	Character obj1=new Character(ch1);//Boxing
        	char ch2=obj1.charValue();//Unboxing
	System.out.println(ch2);
	Integer obj=new Integer(2000);
	int i=obj.intValue();
	String str1=Integer.toBinaryString(obj);
	String str2=Integer.toHexString(obj);
	String str3=Integer.toOctalString(obj);

	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println();
    }
}