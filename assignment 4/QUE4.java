//KHUSHI DESAI
//21BCP264

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QUE4 {
        public static void main(String[] args) {
                JFrameDemo jfd = new JFrameDemo();
        }
}

class JFrameDemo extends JFrame implements WindowListener {
JLabel l;
        public JFrameDemo() {
                addWindowListener(this);
                l=new JLabel("Hello!!");  
                add(l);
                setSize(200, 200);
                setVisible(true);
        }

        public void windowOpened(WindowEvent e) {
                System.out.println("Opening frame");
        }

        public void windowClosing(WindowEvent e) {
                System.out.println("Closing frame");
                dispose();
        }

        public void windowClosed(WindowEvent e) {
                System.out.println("Closed frame");
                System.exit(0);
        }

        public void windowIconified(WindowEvent e) {

                System.out.println("Iconified");
        }

        public void windowDeiconified(WindowEvent e) {

                System.out.println("Deiconified");
        }

        public void windowActivated(WindowEvent e) {

                System.out.println("window activated");
        }

        public void windowDeactivated(WindowEvent e) {
                System.out.println("window deactivated");
        }
}