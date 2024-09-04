import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class Endsem extends JFrame {
    Endsem() {
        setTitle("Device");
        setLayout(null);

        JLabel ID = new JLabel("ID");
        ID.setBounds(30, 50, 50, 30);
        add(ID);

        JTextField inputID = new JTextField(20);
        inputID.setBounds(90, 50, 100, 30);
        add(inputID);

        JButton search = new JButton("Search");
        search.setBounds(80, 90, 100, 30);
        add(search);

        JLabel model = new JLabel("Model");
        model.setBounds(30, 130, 50, 30);
        add(model);

        JTextField modelInfo = new JTextField(20);
        modelInfo.setBounds(90, 130, 100, 30);
        add(modelInfo);

        JLabel brand = new JLabel("Brand");
        brand.setBounds(30, 170, 50, 30);
        add(brand);

        JTextField brandInfo = new JTextField(20);
        brandInfo.setBounds(90, 170, 100, 30);
        add(brandInfo);

        JLabel price = new JLabel("Price");
        price.setBounds(30, 210, 50, 30);
        add(price);

        JTextField priceInfo = new JTextField(20);
        priceInfo.setBounds(90, 210, 100, 30);
        add(priceInfo);

        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String id = inputID.getText();
                System.out.print(id);
                System.out.println("Searching");
                try {
                    BufferedReader br = new BufferedReader(new FileReader("Device.txt"));
                    String[] arr;
                    boolean found = false;
                    for (String txt = br.readLine(); txt != null; txt = br.readLine()) {
                        arr = txt.split(",");
                        if (id.equals(arr[0])) {
                            found = true;
                            modelInfo.setText((String) arr[1]);
                            brandInfo.setText((String) arr[3]);
                            priceInfo.setText((String) arr[2]);
                            break;
                        }
                    }

                    if (!found)
                        JOptionPane.showMessageDialog(null, "Device not found!");

                } catch (Exception e) {
                    System.out.println("Exception: " + e);
                }

            }
        });

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Endsem();
    }
}
