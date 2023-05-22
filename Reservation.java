import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reservation extends JFrame implements ActionListener {

    JLabel label1, label2, label3, label4, label5, label6, label7;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JComboBox<String> cb1, cb2, cb3;
    JButton button;

    Reservation() {
        label1 = new JLabel("Basic Details:");
        label1.setBounds(50, 50, 100, 30);

        label2 = new JLabel("Train Number:");
        label2.setBounds(50, 100, 100, 30);

        tf1 = new JTextField();
        tf1.setBounds(150, 100, 150, 30);

        label3 = new JLabel("Train Name:");
        label3.setBounds(50, 150, 100, 30);

        tf2 = new JTextField();
        tf2.setBounds(150, 150, 150, 30);

        label4 = new JLabel("Class Type:");
        label4.setBounds(50, 200, 100, 30);

        String[] classTypes = {"AC", "Sleeper", "General"};
        cb1 = new JComboBox<>(classTypes);
        cb1.setBounds(150, 200, 150, 30);

        label5 = new JLabel("Date of Journey:");
        label5.setBounds(50, 250, 100, 30);

        tf3 = new JTextField();
        tf3.setBounds(150, 250, 150, 30);

        label6 = new JLabel("From:");
        label6.setBounds(50, 300, 100, 30);

        tf4 = new JTextField();
        tf4.setBounds(150, 300, 150, 30);

        label7 = new JLabel("To:");
        label7.setBounds(50, 350, 100, 30);

        tf5 = new JTextField();
        tf5.setBounds(150, 350, 150, 30);

        button = new JButton("Insert");
        button.setBounds(100, 400, 100, 30);
        button.addActionListener(this);

        add(label1);
        add(label2);
        add(tf1);
        add(label3);
        add(tf2);
        add(label4);
        add(cb1);
        add(label5);
        add(tf3);
        add(label6);
        add(tf4);
        add(label7);
        add(tf5);
        add(button);

        setTitle("Reservation Form");
        setSize(350, 500);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the values entered by the user
        String trainNumber = tf1.getText();
        String trainName = tf2.getText();
        String classType = (String) cb1.getSelectedItem();
        String dateOfJourney = tf3.getText();
        String from = tf4.getText();
        String to = tf5.getText();

        // Insert the values into the database or perform other operations as required
        // ...

        JOptionPane.showMessageDialog(this, "Reservation successful!");
    }

    public static void main(String[] args) {
        new Reservation();
    }
}
