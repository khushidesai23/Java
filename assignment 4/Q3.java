//KHUSHI DESAI
//21BCP264

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 implements KeyListener, ActionListener {
    static JFrame frame;
    static JTextField output;
    static JTextField input;

    public static void main(String args[]) {

        frame = new JFrame("Keyboard Event");
        frame.setBackground(Color.BLUE);
        frame.setSize(300, 300);
        frame.setLayout(null);
        
        input = new JTextField();
        input.setBounds(0, 0, 300, 50);
        frame.add(input);

        output = new JTextField();
        output.setBounds(0, 200, 300, 50);
        frame.add(output);

        JButton exit = new JButton("Exit");
        exit.setBounds(100, 100, 100, 30);
        frame.add(exit);

        Q3 obj = new Q3();
        input.addKeyListener(obj);
        exit.addActionListener(obj);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }

    public void keyReleased(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Released : " + e.getKeyCode());
        if (Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if (Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }

    public void keyPressed(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Pressed : " + e.getKeyCode());
        if (Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if (Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }

    public void keyTyped(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Typed : " + e.getKeyChar());
    }
}
