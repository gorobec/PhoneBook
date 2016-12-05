package ua.artcode.utils;

import ua.artcode.exceptions.InvalidMailException;
import ua.artcode.exceptions.InvalidNameSurnameException;
import ua.artcode.exceptions.InvalidPhoneException;
import ua.artcode.exceptions.InvalidSkypeException;
import ua.artcode.model.ContactsDetails;
import ua.artcode.model.PersonalDetails;
import ua.artcode.model.PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lisa on 12/4/2016.
 */
public class ValidationUtils {
    private static final String NAME_PATTERN = "[A-Z][a-zA-Z1-9]{2,15}";
    private static final String PHONE_PATTERN = "\\d{10}";
    private static final String MAIL_PATTERN = "^(.+)@(.+)$";
    private static final String SKYPE_PATTERN = "^(.+)@(.+)$";

    public static void validateSurname(String name) throws InvalidNameSurnameException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);

        if (!matcher.matches()) throw new InvalidNameSurnameException("Invalid name of surname");

    }

    public static void validateName(String surname) throws InvalidNameSurnameException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(surname);

        if(!matcher.matches()) throw new InvalidNameSurnameException("Invalid name of surname");

    }

    public static void validationMail(String mail) throws InvalidMailException {
        Pattern pattern = Pattern.compile(MAIL_PATTERN);
        Matcher matcher = pattern.matcher(mail);

        if(!matcher.matches()) throw new InvalidMailException("Invalid Mail");

    }

    public static void validationSkype(String skype) throws InvalidSkypeException {
        Pattern pattern = Pattern.compile(SKYPE_PATTERN);
        Matcher matcher = pattern.matcher(skype);

        if(!matcher.matches()) throw new InvalidSkypeException("Invalid Skype");

    }

    public static void validationNumber(String number) throws InvalidPhoneException {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        Matcher matcher = pattern.matcher(number);

        if(!matcher.matches()) throw new InvalidPhoneException("Invalid Phone number");

    }
}
