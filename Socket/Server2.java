// A server that sends data and receives also

import java.io.*;
import  java.net.*;

class Server2
{
	public static void main (String args[ ])	throws Exception
	{
		//create Server socket
		ServerSocket ss=new ServerSocket(888);
		//connect it to client socket
		Socket s=ss.accept();
		System.out.println("Connection established");
		//to send data to the client
		PrintStream ps=new PrintStream(s.getOutputStream());
		//to read data coming from client
		BufferedReader br=new BufferedReader(new InputStreamReader (s.getInputStream()));
		//to read data from keyboard
		BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));

		
		while (true)	//server executes continously
		{
			String str,str1;
			//repeat as long as client does not send null string
			while ((str=br.readLine())!=null)   //read from client
			{
				System.out.println(str);
				str1=kb.readLine();
				ps.println(str1);  //send to client
			}
		//close connection
		ps.close();
		br.close();
		kb.close();
		ss.close();
		s.close();
		System.exit(0); //terminate application
		}
	}
	
}
		