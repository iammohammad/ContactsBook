package com.ContactsBook;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    int userChoice;
    String fName;
    String lName;
    String address;
    String contact;
    String phoneNumber;
    Function phoneBook = new Function();
    public void input () {
        while (true){
            System.out.println("please select what do you want to do :\n" +
                    "1 : creating new contact.\n" +
                    "2 : delete a contact.\n" +
                    "3 : edit a contact.\n" +
                    "4 : show contact");
            userChoice = scanner.nextInt();
            scanner.nextLine();// because enter add a new line
            if (!(userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4)){
                System.out.println("Enter a number between 1 , 2 , 3 or 4 !");}
            switch (userChoice) {
                case 1 -> {
                    System.out.println("First Name : ");
                    fName = scanner.nextLine();
                    System.out.println("Last Name : ");
                    lName = scanner.nextLine();
                    System.out.println("Phone NUmber : ");
                    phoneNumber = scanner.nextLine();
                    System.out.println("Address : ");
                    address = scanner.nextLine();
                    Contact newContact = new Contact(fName, lName, phoneNumber, address);
                    phoneBook.addContact(newContact);
                }
                case 2 -> {
                    System.out.println("Enter the name of contact that you want to remove it :");
                    contact = scanner.nextLine();
                    phoneBook.deleteContact(contact);
                }
                case 3 -> {
                    System.out.println("Enter the name of contact that you want to edit :");
                    contact = scanner.nextLine();
                    phoneBook.editContact(contact);

                }
                case 4 -> {
                    System.out.println("Enter the name of contact that you want to show :");
                    contact = scanner.nextLine();
                    phoneBook.showContact(contact);

                }
            }
        }



        }


    }
