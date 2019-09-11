import java.io.*;

class WriteFileName
{
    public static void main (String arg[ ]) throws Exception
    {
        File obj=new File("C:/Users/Aniket/Desktop/Java","File");
        String arr[]=obj.list();
        File obj1=new File("Demo.txt");
        obj1.createNewFile();
        FileWriter fw=new FileWriter("Demo.txt");
        for (int i=0;i<arr.length;i++)
        {
            fw.write(arr[i]);
            fw.write("          ");
        }
        fw.close();
    } 
}