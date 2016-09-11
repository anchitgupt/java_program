import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingRadio extends JFrame implements ActionListener
{
	JRadioButton r1,r2;
	ButtonGroup bg;
	SwingRadio()
	{
		this.setLayout(new FlowLayout());

		Font f = new Font("tahoma",Font.BOLD,28);
		r1 = new JRadioButton("Male",true);
		r2 = new JRadioButton("Female");

		bg = new ButtonGroup();
		
		bg.add(r1);
		bg.add(r2);

		r1.setFont(f);
		r2.setFont(f);

		this.add(r1);
		this.add(r2);

		r1.addActionListener(this);
		r2.addActionListener(this);
			
	}

public void actionPerformed(ActionEvent ae)
{
	if(r1.getModel().isSelected())
		System.out.println(r1.getText());
	else
		System.out.println(r2.getText());
}
public static void main(String[] args) {

	SwingRadio s = new SwingRadio();
	s.setSize(400,400);
	s.setTitle("Radio Key");
	s.setVisible(true);
	s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}