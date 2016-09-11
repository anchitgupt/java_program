import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Jmenu extends JFrame implements ActionListener 
{
	JMenuBar mb;
	JMenu file,edit;
	JMenuItem op,sa,cl,copy,paste;
	JCheckBoxMenuItem ck;
	Jmenu()
	{
		this.setLayout(new FlowLayout());
		Font f = new Font("Tahoma",Font.BOLD,29);
		mb = new JMenuBar();
		file = new JMenu("file");
		edit = new JMenu("edit");
		op = new JMenuItem("Open");
		sa = new JMenuItem("Save");
		cl = new JMenuItem("Close");

		ck = new JCheckBoxMenuItem("Print");
		ck.setFont(f);

		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");

		mb.add(file);
		mb.add(edit);
		file.setFont(f);
		edit.setFont(f);
		paste.setFont(f);

		file.add(op);
		file.addSeparator();
		file.add(sa);
		this.add(mb);
		
		//file.add("North",mb);
		cl.addActionListener(this);
		ck.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(cl.isArmed())
			System.exit(0);
		if(ck.getModel().isSelected())
			System.out.println("Printing On");
	}
	public static void main(String[] args) {
		
		Jmenu m =new Jmenu();
		m.setSize(400,400);
		m.setVisible(true);
		m.setTitle("JEMnu showing");
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}