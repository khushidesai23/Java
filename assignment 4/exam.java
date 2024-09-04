import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class exam extends Frame {
JLabel l1;
JLabel l2;
JLabel l3;
JLabel l4;

    exam() throws IOException {

        FileReader fr = new FileReader("Device.txt");
        BufferedReader br = new BufferedReader(fr);
        String s=br.readLine();
        int word=0;

        l1 = new JLabel("id: ");
        l1.setBounds(20, 50, 80, 20);

        Button searchButton = new Button("search");
        searchButton.setBounds(80, 80, 100, 30);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                JOptionPane.showMessageDialog(searchButton, "Searched");
            }
        });
        l2 = new JLabel("model");
        l2.setBounds(20, 130, 80, 20);

        l3 = new JLabel("brand");
        l3.setBounds(20, 160, 80, 20);

        l4 = new JLabel("price");
        l4.setBounds(20, 190, 80, 20);

        TextField id = new TextField("1");
        id.setBounds(120, 50, 100, 20);
     
    
        

        TextField model = new TextField("M31");
        model.setBounds(120, 130, 100, 20);


        TextField brand = new TextField("5000");
        brand.setBounds(120, 160, 100, 20);

        TextField price = new TextField("Samsung");
        price.setBounds(120, 190, 100, 20);



        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(id);
        this.add(model);
        this.add(price);
        this.add(brand);
        this.add(searchButton);

       

        this.setSize(300, 300);
        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) throws IOException  {
        exam awt = new exam();

       
    }
}
