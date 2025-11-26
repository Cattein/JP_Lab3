import javax.swing.*;
import java.awt.*;


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

        obj = new JLabel(":)");
        obj.setOpaque(true);
        obj.setHorizontalAlignment(SwingConstants.CENTER);
        obj.setBounds(200, 100, 200, 50);

        JPanel buttonsPanel = new JPanel(new java.awt.FlowLayout());

        JButton ButtonColor = new JButton("Color");
        JButton ButtonSize  = new JButton("Size");
        JButton ButtonMove  = new JButton("Position");

        Panel.add(nextWindow, java.awt.BorderLayout.CENTER);
        nextWindow.add(obj);
        Panel.add(buttonsPanel, java.awt.BorderLayout.SOUTH);

        buttonsPanel.add(ButtonColor);
        buttonsPanel.add(ButtonSize);
        buttonsPanel.add(ButtonMove);

        ButtonColor.addActionListener(e -> {
            Color color = JColorChooser.showDialog(this,
                "Select a color", obj.getBackground());
            obj.setBackground(color);
        });


        ButtonSize.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter size:");
            obj.setSize(Integer.parseInt(name),Integer.parseInt(name));
        });


        ButtonMove.addActionListener(e -> {
            String x = JOptionPane.showInputDialog("Enter X:");
            String y = JOptionPane.showInputDialog("Enter Y:");

            obj.setLocation(Integer.parseInt(x),Integer.parseInt(y));

        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Task_2().setVisible(true);
        });
    }
}
