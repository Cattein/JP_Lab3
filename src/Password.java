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
        JButton checkButton = new JButton("Check");
        panel.add(checkButton);



        checkButton.addActionListener(e -> {
            String password = new String(passwordField.getPassword());
            boolean len   = password.length() >= 8;
            boolean letterBig = password.matches(".*[A-Z].*");
            boolean Special = password.matches(".*[^a-zA-Z0-9].*");
            if (len && letterBig && Special) {
                JOptionPane.showMessageDialog(this, "Good");

            } else {
                StringBuilder msg = new StringBuilder("Password is trash:\n");

                if (!len) {
                    msg.append("- min. 8 signs\n");
                }
                if (!letterBig) {
                    msg.append("- min. 1 Upper liter (A-Z)\n");
                }
                if (!Special) {
                    msg.append("- min. 1 sign  special (np:@#$%)\n");
                }
                JOptionPane.showMessageDialog(this, msg);

            }});
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Password().setVisible(true);
        });
    }
}
