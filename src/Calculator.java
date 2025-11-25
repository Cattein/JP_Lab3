import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;


public class Calculator {
    private static JTextField textField;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel panel = new JPanel(new GridLayout(4,4));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,400);
        frame.setLocationRelativeTo(null); //okno centr

        textField = new JTextField();
         frame.getContentPane().add(BorderLayout.NORTH, textField);
         frame.getContentPane().add(panel);

        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button0 = new JButton("0");

        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiplication = new JButton("*");
        JButton buttonDivision = new JButton("/");
        JButton buttonEquals = new JButton("=");
        JButton buttonClear = new JButton("C");

        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonDivision);

        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonMultiplication);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMinus);

        panel.add(button0);
        panel.add(buttonClear);
        panel.add(buttonEquals);
        panel.add(buttonPlus);









         frame.setVisible(true);

    }
}
