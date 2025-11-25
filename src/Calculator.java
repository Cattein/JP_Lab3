import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {
    private static JTextField textField;
    private static boolean Not = true;
    private static double FirstNumber = 0;
    private static String operator = "";

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

        buttonPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setOperator("+");
            }
        });
        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("-");
            }
        });
        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("*");
            }
        });
        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperator("/");
            }
        });






        buttonEquals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Result();
            }
        });


         frame.setVisible(true);

    }

    private static void addToDisplay(String digit) {
        if (Not) {
            Not = false;
            textField.setText(digit);
        } else {
            textField.setText(textField.getText() + digit);
        }
    }
    private static void setOperator(String Operation) {
        String window = textField.getText();
        if (!window.isEmpty()) {
            FirstNumber = Double.parseDouble(window);
            Not = true;
            operator = Operation;
        }
    }

    private static void Result(){
        String window = textField.getText();
        if (operator.isEmpty() || window.isEmpty()) {
            return;
        }

        double secondNumber = Double.parseDouble(window);
        double result = 0;

        switch (operator) {
            case "+":
                result = FirstNumber + secondNumber;
                break;
            case "-":
                result = FirstNumber - secondNumber;
                break;
            case "*":
                result = FirstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber == 0) {
                    textField.setText("Error");
                    operator = "";
                    Not = true;
                    return;
                }
                result = FirstNumber / secondNumber;
                break;
        }

        textField.setText(String.valueOf(result));
        operator = "";
        Not = true;

    }






}
