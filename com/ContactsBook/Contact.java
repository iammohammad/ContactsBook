package com.ContactsBook;

import java.util.Scanner;
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Contact(String firstName, String lastName, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return "Contact info : \n" +
                "Name : " + firstName + "\n"+
                "Last Name : " + lastName + "\n"+
                "Phone Number : " + phoneNumber + "\n"+
                "Address : " + address;
    }
}

