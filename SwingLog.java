/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author apple
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingLog extends JFrame implements ActionListener{
    JTextField t1;
    JPasswordField t2;
    JLabel l1,l2;
    JButton b1;
    SwingLog()
    {
        this.setLayout(new FlowLayout());
        Font f = new Font("tahoma",Font.BOLD,28);
        
        t1 = new JTextField(20);
        t2 = new JPasswordField(20);
        b1 = new JButton("Login");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        
        t1.setToolTipText("Enter Username");
        t2.setToolTipText("Enter Password");
        b1.setToolTipText("Log in");
        
        //b1.setMnemonics('l');
        
        l1.setFont(f);
        l2.setFont(f);
        t1.setFont(f);
        t2.setFont(f);
        b1.setFont(f);
        
        this.add(l1);
        this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(b1);
        
        b1.addActionListener(this);
                
    }
     public void actionPerformed(ActionEvent ae)
     {
         System.out.println("USername: "+t1.getText());
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        SwingLog j = new SwingLog();
        j.setSize(400,400);
        j.setVisible(true);
        j.setTitle("Java Login Form");
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// TODO code application logic here
    }
    
}
