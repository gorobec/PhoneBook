package ua.artcode.model;


import ua.artcode.exceptions.InvalidNameSurnameException;

import static ua.artcode.utils.ValidationUtils.*;

/**
 * Created by Lisa on 12/4/2016.
 */
public class PersonalDetails {
    private String name;
    private String secondName;

    public PersonalDetails(String name, String secondName) throws InvalidNameSurnameException {

        validateName(name);
        validateSurname(secondName);

        this.name = name;
        this.secondName = secondName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalDetails that = (PersonalDetails) o;

        if (!name.equals(that.name)) return false;
        return secondName.equals(that.secondName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + secondName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalDetails{");
        sb.append("name='").append(name).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
