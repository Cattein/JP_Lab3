import javax.swing.*;
import java.awt.*;

public class Hello {
    private static JLabel Hejka;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hiiiiiiii");
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);


        Hejka = new JLabel("Hello,", SwingConstants.CENTER);
        JButton askNameButton = new JButton("Podaj imię");




        panel.add(Hejka, BorderLayout.CENTER);
        panel.add(askNameButton, BorderLayout.SOUTH);

        frame.add(panel);



        frame.setVisible(true);

    }




}
