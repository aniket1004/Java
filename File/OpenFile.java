import java.io.*;
import java.awt.Desktop;
import java.util.Scanner; 

class OpenFile
{
public static void main (String arg []) throws IOException
{
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter file name");
    String str=sobj.nextLine();

    File obj=new File (str);

    
    if (!Desktop.isDesktopSupported())
    {
        System.out.println("Not Support");
    }

    Desktop dobj =Desktop.getDesktop();

    if (obj.exists())
    {
        dobj.open(obj);
    }

}
}