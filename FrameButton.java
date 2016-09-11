import java.awt.*;
import java.awt.event.*;
class FrameButton extends Frame implements ActionListener
{
	Button b1,b2,b3;//Button is Class

    FrameButton()
    {
    	this.setLayout(null);

    	b1=new Button("RED");
    	b2=new Button("GREEN");
    	b3=new Button("BLUE");
                                        //Buttons Size is Given
    	b1.setBounds(100,100,70,40);    //x,y,w,h
    	b2.setBounds(100,160,70,40);
    	b3.setBounds(100,220,70,40);
                                        //Now Buttons are added into screen
    	this.add(b1);
    	this.add(b2);
    	this.add(b3);

    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);


    }
     public void actionPerformed(ActionEvent ae){ //FUNTIon LIstener For BUTTON
          
          if(ae.getSource()==b1)
          	this.setBackground(Color.RED);

          if(ae.getSource()==b2)
          	this.setBackground(Color.GREEN);

          if(ae.getSource()==b3)
          	this.setBackground(Color.BLUE);
     } 
    public static void main(String[] args) {
    
    FrameButton f = new FrameButton();
    f.setSize(400,400);
    f.setTitle("Java AWT with Buttons");
    f.setVisible(true);

    f.addWindowListener(new MyMan());
	}
}

class MyMan extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}