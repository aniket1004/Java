import java.io.*;

class CreateFile 
{
    public static void main (String arg[ ]) throws IOException
    {

       

        File fobj=new File ("My.txt");
        var b=fobj.createNewFile();
        System.out.println(b);
        String str=fobj.getAbsolutePath();
         System.out.println(str);
         b=fobj.exists();
         System.out.println(b);
         long c=fobj.length();
         System.out.println(c);
         File fobj1=new File ("MyFile.txt");
         b=fobj1.createNewFile(fobj);
         System.out.println(b);
          DataInputStream dobj=new DataInputStream(System.in);
         FileOutputStream fout=new FileOutputStream("My.txt",true);
         
         System.out.println("Enter text: ");
         char ch;
         while ((ch=(char)dobj.read())!='@')
         {
             fout.write(ch);
         }
         
         fout.close();
    }
}