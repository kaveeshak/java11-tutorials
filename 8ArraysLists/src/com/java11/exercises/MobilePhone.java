package com.java11.exercises;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactsArrayList;

    public MobilePhone() {
        contactsArrayList = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        if (!contactsArrayList.contains(contact)) {
            contactsArrayList.add(contact);
            System.out.println("Contact " + contact.getName() + " successfully added.");
        } else {
            System.out.println("Contact " + contact.getName() + " already exists.");
        }
    }

    public void modifyContact(Contact oldContact, Contact newContact) {
        int contactIndex = contactsArrayList.indexOf(oldContact);
        if (contactIndex >= 0) {
            oldContact = contactsArrayList.get(contactIndex);
            contactsArrayList.set(contactIndex, newContact);
            System.out.println("Contact " + oldContact.getName() + " - " + oldContact.getPhoneNumber() +
                    " modified to " + newContact.getName() + " - " + newContact.getPhoneNumber());
        } else {
            System.out.println("Contact " + oldContact.getName() + " does not exist.");
        }
    }

    public void removeContact(Contact contact) {
        int contactIndex = contactsArrayList.indexOf(contact);
        if (contactIndex >= 0) {
            contactsArrayList.remove(contactIndex);
            System.out.println("Contact " + contact.getName() + " successfully removed.");
        } else {
            System.out.println("Contact " + contact.getName() + " does not exist.");
        }
    }

    public void printAllContacts() {
        if (contactsArrayList.size() > 0) {
            for (int i = 0; i < contactsArrayList.size(); i++) {
                Contact contact = contactsArrayList.get(i);
                System.out.println(i + 1 + ". " + contact.getName() + " - " + contact.getPhoneNumber());
            }
        } else {
            System.out.println("There are no contacts.");
        }
    }

    public void findContact(Contact contact) {
        int contactIndex = contactsArrayList.indexOf(contact);
        if (contactIndex >= 0) {
            System.out.println("Contact " + contact.getName() + " is found.");
        } else {
            System.out.println("Contact " + contact.getName() + " is not found.");
        }
    }

    public void printAvailableOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - Quit.");
        System.out.println("\t 2 - Print list of contacts.");
        System.out.println("\t 3 - Add new contact.");
        System.out.println("\t 4 - Update existing contact.");
        System.out.println("\t 5 - Remove contact.");
        System.out.println("\t 6 - Search contact.");
    }
}
