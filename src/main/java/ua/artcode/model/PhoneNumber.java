package ua.artcode.model;

import ua.artcode.enums.Phone_type;
import ua.artcode.exceptions.InvalidPhoneException;

import static ua.artcode.utils.ValidationUtils.*;

/**
 * Created by Lisa on 12/4/2016.
 */
public class PhoneNumber {
    private String number;
    private Phone_type type;// enums

    public PhoneNumber(String number, Phone_type type) throws InvalidPhoneException {

        validationNumber(number);

        this.number = number;
        this.type = type;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PhoneNumber{");
        sb.append("number='").append(number).append('\'');
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
