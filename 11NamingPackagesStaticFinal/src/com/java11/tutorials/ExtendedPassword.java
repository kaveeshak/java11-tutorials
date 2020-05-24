package com.java11.tutorials;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    //If the storePassword method in the parent class is not final, it can be overridden and
    //the class may not behave as we intended.
//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + decryptedPassword);
//    }
}
