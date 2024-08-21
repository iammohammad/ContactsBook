package com.ContactsBook;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private List<Contact> contacts;

    public Function() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void deleteContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().equals(contactName))
                contacts.remove(i);

        }
    }

    public void editContact (String contactName){
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().equals(contactName)){

            }

        }




    }

    public void showContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().equals(contactName))
                System.out.println(contact);
        }
    }
}