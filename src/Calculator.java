import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;


public class Calculator {
    private static JTextField textField;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel(new GridLayout(6,5));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,400);
        frame.setLocationRelativeTo(null); //okno centr
        frame.setVisible(true);

        textField = new JTextField();
         frame.getContentPane().add(BorderLayout.NORTH, textField);
         frame.getContentPane().add(panel);


         JButton numberSystem = new JButton("1");
         panel.add(numberSystem);
    }
}
