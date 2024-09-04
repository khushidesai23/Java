//KHUSHI DESAI
//21BCP264
import java.awt.*;  
import java.awt.event.*;
import javax.swing.JLabel;  

public class pr2 extends Frame implements MouseListener{  
    JLabel l;  
    pr2(){  
        addMouseListener(this);  
        l=new JLabel();  
        l.setBounds(100,100,100,100);  
        add(l);  
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void mouseClicked(MouseEvent e)  { 
        if(e.getButton() == MouseEvent.BUTTON1) {
          l.setText("Left Click!");
        }
        if(e.getButton() == MouseEvent.BUTTON2) {
          l.setText("Middle Click!");
        }
        if(e.getButton() == MouseEvent.BUTTON3) {
          l.setText("Right Click!");
        }
      }  
    public void mouseEntered(MouseEvent e) {  
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
    public void mouseDragged(MouseEvent e) {  
        l.setText("Mouse Dragged");  
    }  
public static void main(String[] args) {  
    new pr2();  
}  
}