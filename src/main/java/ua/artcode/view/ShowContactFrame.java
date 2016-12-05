package ua.artcode.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lisa on 12/5/2016.
 */
public class ShowContactFrame extends JFrame{
    private JTextField name = new JTextField(15);
    private JTextField surname = new JTextField(15);
    //private JTextField address = new JTextField(15);
    private JTextField country = new JTextField(15);
    private JTextField city = new JTextField(15);
    private JTextField street = new JTextField(15);
    private JTextField group = new JTextField(15);
    private JTextField phone = new JTextField(15);

    private JLabel nameLabel = new JLabel("name");
    private JLabel surnameLabel = new JLabel("surname");
   //private JLabel addressLabel = new JLabel("address");
    private JLabel countryLabel = new JLabel("country");
    private JLabel cityLabel = new JLabel("city");
    private JLabel streetLabel = new JLabel("street");
    private JLabel groupLabel = new JLabel("grup");
    private JLabel phoneLabel = new JLabel("phone");
    private JLabel sortByLabel = new JLabel("sort by");

    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("cancel");

    String[] sortByStrings = {"NAME", "SURNAME"};
    private JComboBox sortByList = new JComboBox(sortByStrings);

    public ShowContactFrame() {
        setTitle("Show Contact");
        setResizable(false);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(600, 400));


        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(15, 15, 15, 15);

        constraints.fill = GridBagConstraints.BOTH;

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(nameLabel, constraints);
        constraints.gridx = 1;
        add(name, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(surnameLabel, constraints);
        constraints.gridx = 1;
        add(surname, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        add(countryLabel, constraints);
        constraints.gridx = 1;
        add(country, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        add(cityLabel, constraints);
        constraints.gridx = 1;
        add(city, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        add(streetLabel, constraints);
        constraints.gridx = 1;
        add(street, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        add(groupLabel, constraints);
        constraints.gridx = 1;
        add(group, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        add(phoneLabel, constraints);
        constraints.gridx = 1;
        // нужно отобразить несколько телефонов. как?
        add(phone, constraints );
        constraints.gridx = 1;

        constraints.gridx = 1;
        constraints.gridy = 9;
        add(sortByLabel, constraints);
        constraints.gridx = 2;
        add(sortByList, constraints);

        constraints.gridx = 0;
        constraints.gridy = 8;
        add(okButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 8;
        add(cancelButton, constraints);



        pack();

    }
    }

