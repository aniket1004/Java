import java.io.*;
import java.util.Scanner;

class WriteData
{
    public static void main (String arg[ ]) throws Exception
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter file name: ");
        String str1=obj.nextLine();
        FileWriter fw=new FileWriter(str1);
        System.out.println("Enter string: ");
      String   str=obj.nextLine();
        int i=str.length();
      
        fw.write(str);
        fw.write(i);
        fw.close();
        fobj.close();
    }
}