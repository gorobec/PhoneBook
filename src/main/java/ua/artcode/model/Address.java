package ua.artcode.model;

/**
 * Created by Lisa on 12/4/2016.
 */
public class Address {
    private String country;
    private String city;
    private String street_and_number;

    public Address(String country, String city, String street_and_number) {
        this.country = country;
        this.city = city;
        this.street_and_number = street_and_number;
    }

}
