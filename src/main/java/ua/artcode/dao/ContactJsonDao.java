package ua.artcode.dao;

import ua.artcode.model.Contact;
import ua.artcode.utils.FileSaver;

import java.util.List;

/**
 * Created by Lisa on 12/4/2016.
 */
public class ContactJsonDao implements IConactJsonDao {
    private FileSaver fileSaver;
    List<Contact> contacts;

    public ContactJsonDao(FileSaver fileSaver) {
        this.fileSaver = fileSaver;
        contacts = fileSaver.read();
    }

    public boolean saveContact(Contact contact) {

        if (!contacts.contains(contact)) {
            // write back in file
            contacts.add(contact); // сначало добвляем в лист а потом записываем в contact.txt
            fileSaver.save(contacts);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteContact(Contact contact) {
        if (contacts.contains(contact)) {
            contacts.remove(contact);
            fileSaver.save(contacts);
            return true;
        }

        return false;
    }


}
