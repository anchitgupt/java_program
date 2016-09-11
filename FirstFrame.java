import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class FirstFrame extends JFrame implements ActionListener
{
	JButton b1,b2;
	FirstFrame()
	{
		this.setLayout(new FlowLayout());
		Font f =  new Font("Tahoma",Font.BOLD,29);
		b1 = new JButton("New");
		b2 = new JButton("Exit");

		b1.setFont(f);
		b2.setFont(f);


		this.add(b1);
		this.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			SecondFrame s = new SecondFrame();
			s.setSize(300,300);
			s.setTitle("Second Frame");
			s.setVisible(true);
		}
		else 
			System.exit(0);	
	}
	public static void main(String[] args) {
	FirstFrame f= new FirstFrame();
	f.setSize(400,400);
	f.setTitle("First Frame");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
} 