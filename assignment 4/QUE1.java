import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class First{
public static void main(String[] args) {
JFrameDemo jfd = new JFrameDemo();
    }
}

class JFrameDemo extends JFrame implements WindowListener{
//constructor
public JFrameDemo(){
this.setSize(500, 500);
this.setVisible(true);
this.addWindowListener(this);
    }

@Override
public void windowOpened(WindowEvent e) {
// TODO Auto-generated method stub

    }

@Override
public void windowClosing(WindowEvent e) {
System.out.println("Closing frame");
dispose();

    }

@Override
public void windowClosed(WindowEvent e) {
System.out.println("Closed frame");
System.exit(0);

    }

@Override
public void windowIconified(WindowEvent e) {
// TODO Auto-generated method stub

    }

@Override
public void windowDeiconified(WindowEvent e) {
// TODO Auto-generated method stub

    }

@Override
public void windowActivated(WindowEvent e) {
// TODO Auto-generated method stub

    }

@Override
public void windowDeactivated(WindowEvent e) {
// TODO Auto-generated method stub

    }
}

