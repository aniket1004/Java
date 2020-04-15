import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class BouncingNum extends JFrame implements ActionListener,Runnable
{
	public JButton start;
	public JPanel p;
	public int position=10;
	public BouncingNum()
	{
		setLayout(null);

		start=new JButton("Start");
		start.setSize(110,30);
		start.setLocation(200,420);
		start.addActionListener(this);
		add(start);

		p=new JPanel();
		p.setSize(450,400);
		p.setLocation(10,20);
		add(p);

		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent ae)
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
		int pos=position;
		position+=15;
		Random r=new Random();
		
		int digit=r.nextInt(10);

		JLabel l=new JLabel(""+digit);
		l.setSize(20,20);
		l.setLocation(pos,0);
		Color c=new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255));
		l.setForeground(c);
		p.add(l);
		int i=0;
		while(true)
		{
			i+=8;
			Thread.sleep(150);
			l.setLocation(pos,i);
			if (i>=400)
				i=0;
		}
		}
		catch(Exception e){}
	}
	public static void main(String args[])
	{
		new BouncingNum();
	}
}
