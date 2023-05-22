import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2;
    JTextField tf;
    JPasswordField pf;
    JButton button;

    Login() {
        label1 = new JLabel("Username:");
        label1.setBounds(50, 50, 100, 30);

        tf = new JTextField();
        tf.setBounds(150, 50, 150, 30);

        label2 = new JLabel("Password:");
        label2.setBounds(50, 100, 100, 30);

        pf = new JPasswordField();
        pf.setBounds(150, 100, 150, 30);

        button = new JButton("Login");
        button.setBounds(100, 150, 100, 30);
        button.addActionListener(this);

        add(label1);
        add(tf);
        add(label2);
        add(pf);
        add(button);

        setTitle("Login Form");
        setSize(350, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = tf.getText();
        String password = new String(pf.getPassword());

        if (username.equals("valid_username") && password.equals("valid_password")) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            // Navigate to the main system or dashboard
        } else {
            JOptionPane.showMessageDialog(this, "Invalid login credentials.");
            tf.setText("");
            pf.setText("");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
