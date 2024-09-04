import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class StuDetails extends Frame {
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;

    StuDetails() {
        super("Student Details");

        l1 = new JLabel("Name: Manav Bakori");
        l2 = new JLabel("Roll No: 20BIT084");
        l3 = new JLabel("Marks in DMS: 100");
        l4 = new JLabel("Marks in DSA: 99");
        l5 = new JLabel("Marks in FSPC: 98");

        l1.setBounds(25, 50, 250, 30);
        l2.setBounds(25, 100, 250, 30);
        l3.setBounds(25, 150, 250, 30);
        l4.setBounds(25, 200, 250, 30);
        l5.setBounds(25, 250, 250, 30);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);

        this.setBackground(Color.GREEN);
        this.setSize(400, 400);
        this.setLayout(null);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
}

public class QUE7 {
    public static void main(String[] args) {
        new StuDetails();
    }
}
