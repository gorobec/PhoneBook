package ua.artcode.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lisa on 12/5/2016.
 */
public class StartPageFrame extends JFrame {

    private JButton showContactsButton = new JButton("show contacts");
    private JButton addContactButton = new JButton("add new contact");

    public StartPageFrame() throws HeadlessException {
        setTitle("Phone Book");
        setResizable(false);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(600, 400));

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(15, 15, 15, 15);

        constraints.fill = GridBagConstraints.BOTH;

        showContactsButton.addActionListener(e -> new ShowContactFrame());
        addContactButton.addActionListener(e -> new AddContactFrame());
        
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(showContactsButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        add(addContactButton, constraints);

        pack();
    }

    public JButton getShowContactsButton() {
        return showContactsButton;
    }

    public JButton getAddContactButton() {
        return addContactButton;
    }
}
