import javax.swing.*;
import java.awt.*;


public class Calculator {
    private static JTextField textField;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel(new GridLayout(6,5));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);

        textField = new JTextField();

    }
}
