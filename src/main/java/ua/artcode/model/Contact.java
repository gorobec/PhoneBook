package ua.artcode.model;




/**
 * Created by Lisa on 12/4/2016.
 */
public class Contact {
    private PersonalDetails fio;
    private Address address;
    private Group group;
    private ContactsDetails contactsDetails;

    public Contact(PersonalDetails fio,
                   Address address,
                   Group group,
                   ContactsDetails contactsDetails) {

        //validateFio(fio); // вирішила поризкидати кожне до свого класу
       // validateContactDetails(contactsDetails); имя фамилия скайп номер телефона

        this.fio = fio;
        this.address = address;
        this.group = group;
        this.contactsDetails = contactsDetails;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contact{");
        sb.append("fio=").append(fio);
        sb.append(", address=").append(address);
        sb.append(", group=").append(group);
        sb.append(", contactsDetails=").append(contactsDetails);
        sb.append('}');
        return sb.toString();
    }



}
