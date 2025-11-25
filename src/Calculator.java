import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private static JTextField textField;
    private static boolean FirstNumber = true;


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

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("0");
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("1");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("2");
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("3");
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("4");
            }
        });
        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("5");
            }
        });
        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("6");
            }
        });
        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("7");
            }
        });
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("8");
            }
        });
        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addToDisplay("9");
            }
        });

         frame.setVisible(true);

    }

    private static void addToDisplay(String digit) {
        if (FirstNumber) {
            FirstNumber = false;
            textField.setText(digit);
        } else {
            textField.setText(textField.getText() + digit);
        }
    }





}
