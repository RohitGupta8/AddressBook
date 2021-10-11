package com.bl.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class AppAddressBookMain {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, ArrayList<Contact>> addressBook = new HashMap<>();

    /**
     * Driver Method for executing the code
     */
    public static void main(String[] args) {
        System.out.println("***********************************************\n          Welcome To Address Book\n***********************************************\n");
        AppAddressBookMain appAddressBookMain = new AppAddressBookMain();
        appAddressBookMain.createAddressBook();
    }

    /**
     * method for creating new address book
     */
    private void createAddressBook() {
        int flag = 0;
        while (flag == 0) {
            System.out.println("\n1 => Create new address book.\n2 => Edit existing address book.\n3 => Display all address books.\n4 => Delete Book\n5 => exit");
            System.out.print("Choose what you want to do -> ");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.print("\nEnter the name of address book => ");
                    String addressBookName = scanner.next();

                    // condition to check for uniqueness of address book.
                    if (addressBook.containsKey(addressBookName)) {
                        System.out.println("\nAddress book name is present, enter different name\n\n");
                        break;
                    }
                    int ch = 0;
                    System.out.println("\nChoose what you want to do");
                    ArrayList<Contact> newContactList = new ArrayList<Contact>();
                    addressBook.put(addressBookName,newContactList);
                    while (ch == 0) {
                        System.out.print("1. = Add Contacts\n2. = Display Contact\n3. = Edit Contact\n4. = Delete\n5. = Exit\nEnter Your Choice: ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1 -> createContact(newContactList);
                            case 2 -> read(newContactList);
                            case 3 -> update(newContactList);
                            case 4 -> delete(newContactList);
                            case 5 -> ch = 1;
                            default -> System.out.println("Plz Enter 1 or 2 or 3 0r 4 only");
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Enter the name of address book: ");
                    String addressBookNameOld = scanner.next();
                    if (addressBook.containsKey(addressBookNameOld)) {
                        ArrayList<Contact> contactList = addressBook.get(addressBookNameOld);
                        int ch = 0;
                        while (ch == 0) {
                            System.out.print("1. = Add Contacts\n2. = Display Contact\n3. = Edit Contact\n4. = Delete\n5. = Exit\nEnter Your Choice: ");
                            int choice = scanner.nextInt();
                            switch (choice) {
                                case 1 -> createContact(contactList);
                                case 2 -> read(contactList);
                                case 3 -> update(contactList);
                                case 4 -> delete(contactList);
                                case 5 -> ch = 1;
                                default -> System.out.println("Plz Enter 1 or 2 or 3 0r 4 only");
                            }
                            addressBook.put(addressBookNameOld, contactList);
                        }
                    } else {
                        System.out.println("Enter valid address book name");
                    }
                }
                case 3 -> System.out.println(addressBook);

                case 4 -> {
                    System.out.print("Enter Name of book you want to remove. => ");
                    String removeBookName = scanner.next();
                    if (addressBook.containsKey(removeBookName)) {
                        addressBook.remove(removeBookName);
                        System.out.println("\n Success fully deleted..........\n");
                    } else {
                        System.out.println("Book Name not present");
                    }
                }
                case 5 -> {
                    System.out.println("\n\nthanks for visiting.......\n");
                    flag = 1;
                }
                default -> System.out.println("enter valid option please");
            }
        }
    }

    /**
     * method for delete specific contact
     */
    private void delete(ArrayList<Contact> contactList) {
        System.out.println("Enter Name To Remove from Contact list: ");
        String firstName = scanner.nextLine();
        for (int i = 0; i < contactList.size(); i++) {
            if (Objects.equals(firstName, contactList.get(i).getFirstName())) {
                contactList.remove(contactList.get(i));
                System.out.println("\nDeleted Successfully.....\n");
            } else System.out.println("The name entered is incorrect.");
        }
    }

    /**
     * method for update specific contact
     */
    private void update(ArrayList<Contact> contactList) {
        System.out.println("Enter Name To Edit from Contact list: ");
        String firstNam = scanner.nextLine();
        for (Contact value : contactList) {
            if (Objects.equals(firstNam, value.getFirstName())) {
                System.out.print("Enter First Name: ");
                String firstName = scanner.nextLine();
                value.setFirstName(firstName);
                System.out.print("Enter Last Name: ");
                String lastName = scanner.nextLine();
                value.setLastName(lastName);
                System.out.print("Enter Address: ");
                String address = scanner.nextLine();
                value.setAddress(address);
                System.out.print("Enter City: ");
                String city = scanner.nextLine();
                value.setCity(city);
                System.out.print("Enter State: ");
                String state = scanner.nextLine();
                value.setState(state);
                System.out.print("Enter ZipCode: ");
                String zipcode = scanner.nextLine();
                value.setZipCode(zipcode);
                System.out.print("Enter Phone Number: ");
                String number = scanner.nextLine();
                value.setNumber(number);
                System.out.print("Enter Email id: ");
                String email = scanner.nextLine();
                value.setEmail(email);
                System.out.println("\n Success !  contact updated.....\n\nWhat do you want next: \"");

            } else System.out.println("The name entered is incorrect.");
        }
    }

    /**
     * method for display all contact
     */
    private void read(ArrayList<Contact> contactList) {
        System.out.println("*****************\n  CONTACT LIST\n***************** ");
        for (Contact b : contactList) {
            System.out.println(b.toString());
        }
    }

    /**
     * method for create/add new contact
     */
    private void createContact(ArrayList<Contact> newContactList) {
        scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter ZipCode: ");
        String zipcode = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String number = scanner.nextLine();

        System.out.print("Enter Email id: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zipcode, number, email);
        newContactList.add(contact);
        System.out.println("\nContact Added.......\n\nWhat do you want next: ");
    }
}
