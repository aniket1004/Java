import java.lang.*;
import java.util.Scanner;
import java.io.FileReader;

class ReadData
{
    public static void main (String arg[ ]) throws Exception
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter file name");
        String str=sobj.nextLine();

        FileReader fr=new FileReader(str);
        int i;

        while ((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();
    }
}