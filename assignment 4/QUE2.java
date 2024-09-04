//KHUSHI DESAI
//21BCP264

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class QUE2 extends Frame implements MouseListener {
    static JLabel jl;
        public static void main(String[] args) {
            new QUE2();
        }

    QUE2() {
        addMouseListener(this);
        jl=new JLabel();
        jl.setBounds(20, 50, 100, 20);;
        add(jl);
        setSize(300,300 );
        setVisible(true);
        setLayout(null);
        }

    public void mouseClicked(MouseEvent e) {
        jl.setText("Mouse  clicked");
    }

    public void mouseEntered(MouseEvent e) {
        jl.setText("Mouse  entered");
    }

    public void mouseExited(MouseEvent e) {
        jl.setText("Mouse  exited");
    }

    public void mousePressed(MouseEvent e) {
        jl.setText("Mouse  pressed");
    }

    public void mouseReleased(MouseEvent e) {
        jl.setText("Mouse  released");
    }
   
}


