import java.awt.*;
import java.awt.event.*;
class SlideDown  extends Frame implements ItemListener
{
   Choice c;

   SlideDown()
   {
   	this.setLayout(new FlowLayout());
   	Font f = new Font("arial",Font.BOLD,28);

   	c=new Choice();

   	c.add("INDIA");
   	c.add("AMERIACA");
    c.add("KOREA");
   	c.add("INDONESIA");
   	c.add("BRITAIN");
   	c.add("BHUTAN");
   	c.add("SRI LANKA");

   	c.setFont(f);

   	c.addItemListener(this);
   }
   public void itemState(ItemEvent ie)
   {
   	System.out.println("You Selected: "+c.getSelectedItem());
   }
   public static void main(String[] args) {
   	SlideDownAWT s =new SlideDownAWT();
   	s.setTitle("Slide Down");
   	s.setSize(400,400);
   	s.setResizable(false);
   	s.addWindowListener(new B());

   }
}
class B extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}