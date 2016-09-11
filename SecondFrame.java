import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class SecondFrame extends JFrame implements ActionListener
{
	JButton b;
	SecondFrame()
	{
		this.setLayout(new FlowLayout());
		Font f = new Font("Tahoma",Font.BOLD,29);
		b = new JButton("Exit");
		b.setFont(f);
		this.add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
		   this.dispose();	
	}
}