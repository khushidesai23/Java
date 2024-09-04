//KHUSHI DESAI
//21BCP264

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8 {
    static Dialog d;

    Q8() {
        Frame f = new Frame();

        d = new Dialog(f, "Dialog Example", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("OK");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "HELLO HOW ARE YOU?");

            }
        });

        d.add(new JLabel("Click button to continue."));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public static void main(String args[]) {
        new Q8();
    }
}