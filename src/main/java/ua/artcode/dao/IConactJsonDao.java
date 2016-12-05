package ua.artcode.dao;

import ua.artcode.model.Contact;

/**
 * Created by Lisa on 12/4/2016.
 */
public interface IConactJsonDao {

    boolean saveContact(Contact contact);
    boolean deleteContact(Contact contact);
    //boolean modifyContact(Contact contact);
}
