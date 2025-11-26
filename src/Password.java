import javax.swing.*;

public class Password extends JFrame{
    public Password() {

        setTitle("Really strong password ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Password().setVisible(true);
        });
    }
}
