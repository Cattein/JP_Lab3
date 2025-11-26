import javax.swing.*;

public class Password extends JFrame{
    public Password() {
        setTitle("Real strong Password ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        add(panel);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(10);
        panel.add(passwordField);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Password().setVisible(true);
        });
    }
}
