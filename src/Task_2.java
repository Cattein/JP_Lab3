import javax.swing.*;
import java.awt.*;

public class Task_2 extends JFrame {

    public Task_2() {
        setTitle("Dynamiczny interfejs ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Task_2().setVisible(true);
        });
    }
}
