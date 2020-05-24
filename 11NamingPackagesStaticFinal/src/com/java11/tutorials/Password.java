package com.java11.tutorials;

public class Password {
    private static final int KEY = 58165478;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = getEncryptDecrypt(password);
    }

    private int getEncryptDecrypt(int password) {
        return KEY ^ password;
    }

    public final void storePassword() {
        System.out.println("Saving password as " + encryptedPassword + ".");
    }

    public boolean letMeIn(int password) {
        if (encryptedPassword == getEncryptDecrypt(password)) {
            System.out.println("Welcome.");
            return true;
        } else {
            System.out.println("Password is invalid.");
            return false;
        }
    }
}
