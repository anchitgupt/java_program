import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
class DataTransfer extends JFrame implements ActionListener
{
	JTextField t1,t2;
	JButton b;
	JLabel l1,l2;
	JProgressBar pb;
	DataTransfer()
	{
		this.setLayout(new FlowLayout());
		Font f = new Font("Tahoma",Font.BOLD,30);
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		b = new JButton("Convert");
		pb = new JProgressBar();

		l1 = new JLabel("Source File");
		l2 = new JLabel("Destination File");
		t1.setFont(f);
		t2.setFont(f);
		b.setFont(f);
		l1.setFont(f);
		l2.setFont(f);

		this.add(l1);
		this.add(t1);
		this.add(l2);
		this.add(t2);
		this.add(b);
		this.add(pb);

		b.addActionListener(this);

	}
 public void actionPerformed(ActionEvent ae)
 {


		try
		{
			
		    String read = t1.getText();
		    String write = t2.getText();	
            FileInputStream fis = new FileInputStream(read);
            BufferedInputStream bis = new BufferedInputStream(fis,10000);

            FileOutputStream fos = new FileOutputStream(write,true);
            BufferedOutputStream bos = new BufferedOutputStream(fos,10000);
             
             long t1 = System.currentTimeMillis();
            int a;
            while((a=bis.read())!=-1)
            	{
                    System.out.print((char)a);
                    bos.write(a);
                    

                }
        bis.close();
        fis.close();
        bos.close();
        fos.close();
        long t2 = System.currentTimeMillis();
        System.out.println("Time is: "+ (t2-t1));

		}
		catch(Exception ex)
		{
			System.out.println(ex);

 }
}

	public static void main(String[] args) {

		DataTransfer d = new DataTransfer();
		d.setSize(600,600);
		d.setTitle("Data transfer");
		d.setVisible(true);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
 }
}