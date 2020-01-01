package com.java11.exercises;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Contact) {
            Contact contact = (Contact) object;
            if (name.equalsIgnoreCase(contact.name)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
