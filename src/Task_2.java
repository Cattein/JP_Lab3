import javax.swing.*;


public class Task_2 extends JFrame {
    private JLabel obj;

    public Task_2() {
        setTitle("Dynamiczny interfejs ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel Panel = new JPanel(new java.awt.BorderLayout());
        setContentPane(Panel);

        JPanel nextWindow = new JPanel(null);
        Panel.add(nextWindow, java.awt.BorderLayout.CENTER);

        obj = new JLabel(":)");
        obj.setHorizontalAlignment(SwingConstants.CENTER);
        obj.setBounds(200, 100, 200, 50);



        nextWindow.add(obj);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Task_2().setVisible(true);
        });
    }
}
