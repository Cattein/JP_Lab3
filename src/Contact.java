import javax.swing.*;
import java.awt.*;
public class Contact {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Contact book");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());


            JPanel inputPanel = new JPanel(new GridLayout(3, 2, 2, 2));
            frame.add(inputPanel, BorderLayout.NORTH);

            JLabel nameLabel = new JLabel("imię:");
            JTextField nameField = new JTextField(15);
            inputPanel.add(nameLabel);
            inputPanel.add(nameField);

            JLabel phoneLabel = new JLabel("numer :");
            JTextField phoneField = new JTextField(15);
            inputPanel.add(phoneLabel);
            inputPanel.add(phoneField);

            JLabel emailLabel = new JLabel("e-mail:");
            JTextField emailField = new JTextField(20);
            inputPanel.add(emailLabel);
            inputPanel.add(emailField);

            DefaultListModel<String> contactBook = new DefaultListModel<>();
            JList<String> contactList = new JList<>(contactBook);
            contactList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


            JPanel buttonPanel = new JPanel(new FlowLayout());

            JScrollPane scrollPane = new JScrollPane(contactList);
            frame.add(scrollPane, BorderLayout.CENTER);
            JButton addButton = new JButton("Dodaj");
            JButton editButton = new JButton("Edytuj");
            JButton deleteButton = new JButton("Usuń");

            buttonPanel.add(addButton);
            buttonPanel.add(editButton);
            buttonPanel.add(deleteButton);
            frame.add(buttonPanel, BorderLayout.SOUTH);



            addButton.addActionListener(e -> {
                String name = nameField.getText().trim();
                String phone = phoneField.getText().trim();
                String email = emailField.getText().trim();
                String contact = name + " - " + phone + " - " + email;
                contactBook.addElement(contact);
                nameField.setText("");
                phoneField.setText("");
                emailField.setText("");
            });

            editButton.addActionListener(e -> {
                int i = contactList.getSelectedIndex();

                String name = nameField.getText().trim();
                String phone = phoneField.getText().trim();
                String email = emailField.getText().trim();

                String contact = name + " - " + phone + " - " + email;
                contactBook.setElementAt(contact, i);
            });

            deleteButton.addActionListener(e -> {
                int i = contactList.getSelectedIndex();
                contactBook.remove(i);
                nameField.setText("");
                phoneField.setText("");
                emailField.setText("");
            });


            frame.setVisible(true);

        });




}
}

