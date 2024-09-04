//Write a program to accept the id through a GUI and Display details of the Mobile at the bottom of the GUI once the user will click on the Search button

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class New extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;
    JButton b1;
    New()
    {
        l1=new JLabel("ID");
        l2=new JLabel("Model");
        l3=new JLabel("Brand");
        l4=new JLabel("Price");
        t1=new JTextField(20);
        t2=new JTextField(20);
        t3=new JTextField(20);
        t4=new JTextField(20);
        b1=new JButton("Search");
        setLayout(null);
        l1.setBounds(30,50,50,30);
        t1.setBounds(90,50,100,30);
        b1.setBounds(80,90,100,30);
        l2.setBounds(30,130,50,30);
        t2.setBounds(90,130,100,30);
        l3.setBounds(30,170,50,30);
        t3.setBounds(90,170,100,30);
        l4.setBounds(30,210,50,30);
        t4.setBounds(90,210,100,30);
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        String id=t1.getText();
        System.out.print(id);
        System.out.println("Searching");
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("Device.txt"));
            String[] arr;
            boolean found=false;
            for(String txt=br.readLine();txt!=null;txt=br.readLine())
            {
                arr=txt.split(",");
                if(id.equals(arr[0]))
                {
                    t2.setText(arr[1]);
                    t3.setText(arr[2]);
                    t4.setText(arr[3]);
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                t2.setText("Not Found");
                t3.setText("Not Found");
                t4.setText("Not Found");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        New e=new New();
        e.setSize(300,300);
        e.setVisible(true);
    }
}