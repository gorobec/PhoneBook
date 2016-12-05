package ua.artcode.controller;

import ua.artcode.dao.IConactJsonDao;
import ua.artcode.view.AddContactFrame;
import ua.artcode.view.StartPageFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa on 12/5/2016.
 */
public class Controller {

    private StartPageFrame startFrame;
    private AddContactFrame frame;
    private IConactJsonDao dao;

    public Controller(StartPageFrame startFrame, AddContactFrame frame, IConactJsonDao dao) {
        this.startFrame = startFrame;
        this.frame = frame;
        this.dao = dao;

        startFrame.getAddContactButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    frame.getCancelButton().addActionListener(e1 -> {
                    frame.getContactName().setText("");
                    frame.getSurname().setText("");
                    frame.getCountry().setText("");
                    frame.getCity().setText("");
                    frame.getStreet().setText("");
                    frame.getGroup().setText("");

                });

                frame.getAddNewPhoneButton().addActionListener(new AddNewPhoneButtonActionListener());
                frame.getOkButton().addActionListener(new AddOkButtonActionListener());

            }
        });
        startFrame.getShowContactsButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

    private class AddNewPhoneButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class AddOkButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    private class AddContactButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {


        }
    }

    private class ShowContactButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
