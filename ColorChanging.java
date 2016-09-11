import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ColorChanging extends JFrame implements ActionListener
{
	JTextField t1;
	JButton b1;

	ColorChanging()
	{
		this.setLayout(new FlowLayout());
		Font f = new Font("tahoma",Font.BOLD,29);
		t1 = new JTextField(20);
		b1 = new JButton("Click");
		t1.setFont(f);
		b1.setFont(f);

		this.add(t1);
		this.add(b1);

		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		Color cl=null;
		cl=JColorChooser.showDialog(this,"Select Color",cl);
		t1.setBackground(cl);	
		JOptionPane.showMessageDialog(this,"Hello java");
		JOptionPane.showMessageDialog(this,"Hello java","WRANING FOR YOU",JOptionPane.WARNING_MESSAGE);
	}
	public static void main(String[] args) {
		ColorChanging c = new ColorChanging();
		c.setSize(400,400);
		c.setVisible(true);
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}