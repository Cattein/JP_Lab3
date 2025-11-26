import javax.swing.*;

public class Task_1  {

    public Task_1() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Prosta aplikacja");
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);


        JLabel nameLabel = new JLabel("Login:");
        JLabel passwordLabel = new JLabel("Password:");
        JTextField nameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);

        JButton sendButton = new JButton("Enter");


        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(sendButton);

        frame.setVisible(true);

    }
}
