
class Demo extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.print(i);
		}
	}
}

class Hello
{
	public static void main(String arg[ ])
	{
		Demo obj=new Demo();
		Thread t1=new Thread(obj);
		Thread t2=new Thread (obj);
		
		t1.start();
		t2.start();
	}
}