package ua.artcode.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa on 12/5/2016.
 */
public class AddContactFrame extends JFrame {
    private JTextField name = new JTextField(15);
    private JTextField surname = new JTextField(15);
    private JTextField address = new JTextField(15);
    private JTextField country = new JTextField(15);
    private JTextField city = new JTextField(15);
    private JTextField street = new JTextField(15);
    private JTextField group = new JTextField(15);
    private JTextField phone = new JTextField(15);

    private JLabel nameLabel = new JLabel("name");
    private JLabel surnameLabel = new JLabel("surname");
    private JLabel addressLabel = new JLabel("address");
    private JLabel countryLabel = new JLabel("country");
    private JLabel cityLabel = new JLabel("city");
    private JLabel streetLabel = new JLabel("street");
    private JLabel groupLabel = new JLabel("grup");
    private JLabel phoneLabel = new JLabel("phone");

    private JButton addNewPhoneButton = new JButton("add phone number");
    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("cancel");

    String[] phoneStrings = {"CELL_PHONE", "WORK_PHONE", "HOME_PHONE"};
    String[] groupStrings = {"BASE", "OOP", "PROF"};

    private JComboBox phoneList = new JComboBox(phoneStrings);
    private JComboBox groupList = new JComboBox(groupStrings);

    public AddContactFrame() {

        setTitle("Add Contact");
        setResizable(false);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(new Dimension(600, 400));

        //phoneList.setSelectedIndex(3);
        /*phoneList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
               // label.setText(item);
            }
        });*/

       // groupList.setSelectedIndex(3);
        /*groupList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

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
        // add combox
        constraints.gridx = 2;
        add(groupList, constraints );

        constraints.gridx = 0;
        constraints.gridy = 7;
        add(phoneLabel, constraints);
        constraints.gridx = 1;
        add(phone, constraints );
        constraints.gridx = 2;
        add(phoneList, constraints );

        constraints.gridx = 0;
        constraints.gridy = 8;
        add(addNewPhoneButton, constraints);

        constraints.gridx = 0;
        constraints.gridy = 9;
        add(okButton, constraints);
        constraints.gridx = 1;
        add(cancelButton, constraints);

        pack();

    }

    public JTextField getContactName() {
        return name;
    }

    public JTextField getSurname() {
        return surname;
    }

    public JTextField getAddress() {
        return address;
    }

    public JTextField getCountry() {
        return country;
    }

    public JTextField getCity() {
        return city;
    }

    public JTextField getStreet() {
        return street;
    }

    public JTextField getGroup() {
        return group;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public JLabel getSurnameLabel() {
        return surnameLabel;
    }

    public JLabel getAddressLabel() {
        return addressLabel;
    }

    public JLabel getCountryLabel() {
        return countryLabel;
    }

    public JLabel getCityLabel() {
        return cityLabel;
    }

    public JLabel getStreetLabel() {
        return streetLabel;
    }

    public JLabel getGroupLabel() {
        return groupLabel;
    }

    public JButton getAddNewPhoneButton() {
        return addNewPhoneButton;
    }

    public JButton getOkButton() {
        return okButton;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }

    public String[] getPhoneStrings() {
        return phoneStrings;
    }

    public String[] getGroupStrings() {
        return groupStrings;
    }

    public JComboBox getPhoneList() {
        return phoneList;
    }

    public JComboBox getGroupList() {
        return groupList;
    }
}

