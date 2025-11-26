import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hello {
    private static JLabel Hejka;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hiiiiiiii");
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);


        Hejka = new JLabel("Hi!", SwingConstants.CENTER);
        JButton askNameButton = new JButton("Type your name");

        frame.add(panel);
        panel.add(Hejka, BorderLayout.CENTER);
        panel.add(askNameButton, BorderLayout.SOUTH);

        askNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(frame, "write your name:");
                if (name != null && !name.trim().isEmpty()) {
                    String message = "Hello, " + name + "!";
                    Hejka.setText(message);
                }
            }
        });


        frame.setVisible(true);

    }




}
