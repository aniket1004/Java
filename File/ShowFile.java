import java.io.*;

class ShowFile
{

    public static void main(String arg[ ]) throws IOException
    {
        File fobj=new File ("C:/Users/Aniket/Desktop/Java","File");
        
        String str[]=fobj.list();
        for (int i=0;i<str.length;i++)
        {
           System.out.print(str[i]+"    ");
        }
    }
}