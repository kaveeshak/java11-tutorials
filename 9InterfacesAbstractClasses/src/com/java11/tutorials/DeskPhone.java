package com.java11.tutorials;

public class DeskPhone implements ITelephone {
    private int phoneNumber;
    private boolean isRinging;

    public DeskPhone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("There is no power button on a desk phone.");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing " + phoneNumber + " on desk phone.");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the phone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (this.phoneNumber == phoneNumber) {
            System.out.println("Ring ring.");
            isRinging = true;
        } else {
            isRinging = false;
        }
        return true;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
