import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Jtoolbar extends JFrame implements ActionListener 
{
	JToolBar tb;
	JButton b1,b2,b3;
	ImageIcon i1,i2,i3;
	Jtoolbar()
	{
		this.setLayout(new BorderLayout());
		Font f = new Font("tahoma",Font.BOLD,29);

		tb = new JToolBar();

		i1 = new ImageIcon("//Users//apple//Desktop//java tutorial//uiswing//examples//misc//TrackFocusDemoProject//src//misc//images//Adele.jpg");
		i2 = new ImageIcon("//Users//apple//Desktop//java tutorial//uiswing//examples//misc//TrackFocusDemoProject//src//misc//images//Alexi.jpg");
		i3 = new ImageIcon("//Users//apple//Desktop//java tutorial//uiswing//examples//misc//TrackFocusDemoProject//src//misc//images//Cosmo.jpg");
		b1 = new JButton("Adele",i1);
		b2 = new JButton("Alexi",i2);
		b3 = new JButton("Cosmo",i3);

            
		tb.add(b1);
		tb.add(b2);
		tb.add(b3);
		this.add("North",tb);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{

	}
	public static void main(String[] args) {
		
		Jtoolbar m =new Jtoolbar();
		m.setSize(400,400);
		m.setVisible(true);
		m.setTitle("JEMnu showing");
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}