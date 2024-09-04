//KHUSHI DESAI
//21BCP264

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q5 {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        JButton btnH = new JButton("HELLO");
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "HELLO HOW ARE YOU?");
            }
        });

        JButton btnM = new JButton("MESSAGE");
        btnM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "HAVE A GOOD DAY:)");
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnM);
        buttonPanel.add(btnH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}