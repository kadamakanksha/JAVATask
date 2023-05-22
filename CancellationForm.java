import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CancellationForm{
    public static void main(String[] args) {
        JLabel pnrLabel = new JLabel("PNR Number:");
        JTextField pnrField = new JTextField(10);

        JPanel pnrPanel = new JPanel();
        pnrPanel.add(pnrLabel);
        pnrPanel.add(pnrField);

        JButton cancelButton = new JButton("Cancel");
        JButton okButton = new JButton("OK");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(cancelButton);
        buttonPanel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pnr = pnrField.getText();
                // Use the PNR number to retrieve information about the reservation
                // Display the information to the user
                int confirmed = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this reservation?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirmed == JOptionPane.YES_OPTION) {
                    // Perform cancellation
                    JOptionPane.showMessageDialog(null, "Your reservation has been cancelled.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the form
                System.exit(0);
            }
        });

        JFrame frame = new JFrame("Cancellation Form");
        frame.setLayout(new GridLayout(2, 1));
        frame.add(pnrPanel);
        frame.add(buttonPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
