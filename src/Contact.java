import javax.swing.*;
import java.awt.*;
public class Contact {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contact book");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());


            JPanel inputPanel = new JPanel(new GridLayout(3, 2, 2, 2));
            frame.add(inputPanel, BorderLayout.NORTH);

            JLabel nameLabel = new JLabel("Name:");
            JTextField nameField = new JTextField(15);
            inputPanel.add(nameLabel);
            inputPanel.add(nameField);

            JLabel phoneLabel = new JLabel("Telephone:");
            JTextField phoneField = new JTextField(15);
            inputPanel.add(phoneLabel);
            inputPanel.add(phoneField);

            JLabel emailLabel = new JLabel("Gmail:");
            JTextField emailField = new JTextField(20);
            inputPanel.add(emailLabel);
            inputPanel.add(emailField);




            frame.setVisible(true);

        });




}
}

