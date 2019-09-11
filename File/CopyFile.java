import java.io.*;
import java.util.Scanner;

class CopyFile
{

    public static void main(String arg[ ]) throws IOException
    {
        Scanner sobj=new Scanner(System.in);
        String str=sobj.nextLine();
        FileReader fr=new FileReader(str);
        BufferedReader br=new BufferedReader(fr);
        str=sobj.nextLine();
        File obj=new File (str);
        obj.createNewFile();
        FileWriter fw=new FileWriter(str);
        String ch;
        while ((ch=br.readLine())!=null)
        {
            fw.write(ch);
            fw.flush();
        }
        br.close();
        fw.close();
    }
}