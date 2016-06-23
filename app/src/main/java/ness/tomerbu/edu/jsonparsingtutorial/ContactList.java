package ness.tomerbu.edu.jsonparsingtutorial;

import java.util.ArrayList;
import java.util.List;

public class ContactList {

    private List<Contact> contacts = new ArrayList<Contact>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContactList() {
    }
    public void add(Contact contact){
        contacts.add(contact);
    }
    /**
     * 
     * @param contacts
     */
    public ContactList(List<Contact> contacts) {
        this.contacts = contacts;
    }

    /**
     * 
     * @return
     *     The contacts
     */
    public List<Contact> getContacts() {
        return contacts;
    }

    /**
     * 
     * @param contacts
     *     The contacts
     */
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

}
