package ua.artcode.model;

import ua.artcode.exceptions.InvalidMailException;
import ua.artcode.exceptions.InvalidSkypeException;

import static ua.artcode.utils.ValidationUtils.*;

/**
 * Created by Lisa on 12/4/2016.
 */
public class ContactsDetails {
    private PhoneNumber phoneNumber;
    private String skype;
    private String mail;

    public ContactsDetails(PhoneNumber phoneNumber, String skype, String mail) throws InvalidSkypeException, InvalidMailException {

        //validationPhoneNumber(phoneNumber);
        validationSkype(skype);
        validationMail(mail);

        this.phoneNumber = phoneNumber;
        this.skype = skype;
        this.mail = mail;
    }


}
