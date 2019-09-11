import java.awt.*;
import java.awt.event.*;

class MarvellousColor extends Frame implements ActionListener
{
	Button rb,gb,bb;
	public MarvellousColor()
	{
		rb=new Button ("Red");
		gb=new Button ("Green");
		bb=new Button ("Blue");
		add(rb);
		add(gb);
		add(bb);
		
		rb.addActionListener(this);
		gb.addActionListener(this);
		bb.addActionListener(this);

		FlowLayout fobj = new FlowLayout();
		setLayout(fobj);
		setTitle("Marvellous");

		setSize(300,800);

		setVisible(true);
	}
	
	public void actionPerformed (ActionEvent e)
	{
		String str=e.getActionCommand();
		
		if (str.equals("Red"))
		{
			setBackground(Color.red);
		}
		else if (str.equals("Green"))
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
		}
	}
	public static void main (String arg[ ])
	{
		MarvellousColor mobj=new MarvellousColor();
	}
}