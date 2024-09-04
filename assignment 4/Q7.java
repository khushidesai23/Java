import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Q7 extends Frame {
JLabel l1;
JLabel l2;
JLabel l3;

    Q7() {

        super("Student details:");

        l1 = new JLabel("First Name");
        l1.setBounds(20, 50, 80, 20);

        l2 = new JLabel("Last Name");
        l2.setBounds(20, 80, 80, 20);

        l3 = new JLabel("Date of Birth");
        l3.setBounds(20, 110, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        Button sbmt = new Button("Submit");
        sbmt.setBounds(20, 160, 100, 30);
        sbmt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(sbmt, "SUBMITTED SUCCESFULLY");
            }
        });

        Button reset = new Button("Reset");
        reset.setBounds(120, 160, 100, 30);
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(reset, "RESET SUCCESFULL");
            }
        });

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(firstNameTF);
        this.add(lastNameTF);
        this.add(dobTF);
        this.add(sbmt);
        this.add(reset);

        this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Q7 awt = new Q7();
    }
}
