import java.awt.*;
import java.awt.event.*;
class LoginScreen extends Frame implements ActionListener 
{
   Label l1,l2;
   TextField t1,t2;
   Button b1;
   static Image icon;
   LoginScreen()
   {
   	this.setLayout(new FlowLayout());
   	Font f = new Font("arial",Font.BOLD,28);
   	icon =Toolkit.getDefaultToolkit().getImage("/Users/apple/Desktop/rocketship.gif");
   	l1=new Label("Username");
   	l2=new Label("Password");
   	t1=new TextField(20);
   	t2=new TextField(20);
   	b1=new Button("Login here");

   	t1.setBackground(Color.YELLOW);
   	t2.setBackground(Color.YELLOW);
                      //TO HAVE BACKGROUND COLOR
   	t1.setForeground(Color.RED);
   	t2.setForeground(Color.RED);

   	l1.setFont(f);
   	t1.setFont(f);
   	t2.setFont(f);
   	l2.setFont(f);
   	b1.setFont(f);

     this.add(l1); 
     this.add(t1); 
     this.add(l2); 
     this.add(t2); 
     this.add(b1);

     b1.addActionListener(this); 
     this.setBackground(new Color(112,116,118));
    }
    public void actionPerformed(ActionEvent ae)
    {
    	System.out.println(t1.getText());
    	System.out.println(t2.getText());

    	t1.setText("");
    	t2.setText("");

    	t1.requestFocus();

    }
    public static void main(String[] args) {
    	
    	LoginScreen l = new LoginScreen();
    	l.setSize(400,400);
    	l.setTitle("Log In");
    	l.setVisible(true);
    	l.setResizable(false);

    	l.addWindowListener(new B());
    	l.setIconImage(icon);

    }
}
class B extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}