import java.awt.Frame;

public class Q4 extends Frame {
    Q4(String title) {
        super();
        this.setTitle(title);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        Q4 window = new Q4("Create Window Example");
    }
}