import java.io.*;

class ShowFileSize
{
    public static void main (String arg[ ]) throws Exception
    {
        File obj=new File("C:/Users/Aniket/Desktop/Java","File");
        String arr[]=obj.list();
        System.out.println("File name"+"    "+"Size");
        for (int i=0;i<arr.length;i++)
        {
            File obj1=new File (arr[i]);
            System.out.println(arr[i]+"   "+obj1.length());
            
        }
        
        
    }
}