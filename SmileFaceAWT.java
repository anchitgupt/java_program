import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
class SmileFaceAWT  extends JFrame
{
	public void paint1(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(50,50,400,400);
		g.fillRect(50,50,400,400);
		g.setColor(Color.GREEN);
		g.drawRect(100,100,300,300);
		g.fillRect(100,100,300,300);
		g.setColor(Color.BLUE);
		//g.drawArc(100,100,350,350,0,360);
		g.fillArc(100,100,300,300,0,360); 
		g.setColor(Color.RED);
        g.drawArc(180,250,150,120,0,-180);

	}
	public static void main(String[] args) {
		SmileFaceAWT s =new SmileFaceAWT();
		s.setSize(600,600);
		s.setTitle("Smily");
		s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
