import FascinatingNumber.FascinatingNo1;




import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class SpecialNumerals extends JFrame implements ItemListener,ActionListener
{
	JButton b1;
	JTextField t1,t2;
	JLabel l1,l2;
	Choice c1;

	SpecialNumerals()
	{	
		this.setLayout(new FlowLayout());

 		c1 = new Choice();
		b1 = new JButton("Check");

		t1 = new JTextField(20);
		t2 = new JTextField(20);

		l1= new JLabel("Input");
		l2= new JLabel("Output");


		c1.add("All");
		c1.add("Fascinating Number");
		c1.add("HAppy Number");
		c1.add("Neven Number");
		c1.add("Evil Number");
		c1.add("Perfect Number");
		c1.add("Special Number");
		c1.add("Neon Number");
		c1.add("Prime Perfect Number");
		c1.add("Automorphic Number");
		c1.add("Reverse Number");



		this.add(l1);
		this.add(t1);
		this.add(c1);
		this.add(b1);
		this.add(l2);
		this.add(t2);

		//b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		boolean b=false;
          if(ae.getSource()==b1)
          { 
          	if(c1.getSelectedItem()=="Fascinating Number")
          	{	String str=t1.getText();
          		b=FascinatingNo1.fasciatingno(str);
			if(b==true)
				t2.setText("Fascinating Number");
			else 
				t2.setText("Not Fascinating Number");
            }
          }
	}
	public void itemStateChanged(ItemEvent ie)
	{ 
			
	}
	 public static void main(String[] args) {
		
		SpecialNumerals s = new SpecialNumerals();
		s.setSize(250,400);
		s.setTitle("Number Checker");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}