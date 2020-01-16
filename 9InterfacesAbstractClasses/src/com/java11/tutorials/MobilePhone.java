package com.java11.tutorials;

public class MobilePhone implements ITelephone {
    private int phoneNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone is powered up.");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now dialing " + phoneNumber + " on mobile phone.");
        } else {
            System.out.println("Mobile phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (this.phoneNumber == phoneNumber && isOn) {
            System.out.println("Melody ring.");
            isRinging = true;
        } else {
            System.out.println("Mobile phone is not on or number is different.");
            isRinging = false;
        }
        return true;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
