package com.java11.tutorials;

public class ScopeCheck {
    public int publicVariable = 10;
    private int privateVariable = 20;

    public ScopeCheck() {
        System.out.println("ScopeCheck class is created.");
        System.out.println("The value of publicVariable is " + publicVariable + ".");
        System.out.println("The value of privateVariable is " + privateVariable + ".");
    }

    public void timesTwo() {
        //Notice that we have another instance variable with the same name. However the variable below is local to
        //the method.
        int privateVariable = 2;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " times two is " + (i * privateVariable) + ".");
        }
    }

    public int getPublicVariable() {
        return publicVariable;
    }

    public void setPublicVariable(int publicVariable) {
        this.publicVariable = publicVariable;
    }

    public int getPrivateVariable() {
        return privateVariable;
    }

    public void setPrivateVariable(int privateVariable) {
        this.privateVariable = privateVariable;
    }

    public class InnerClass {
        private int privateVariable = 20;

        public InnerClass() {
            System.out.println("InnerClass class is created.");
            System.out.println("The value of privateVariable is " + privateVariable + ".");
        }

        public void timesTwo() {
            //Notice that we have another instance variable with the same name. However the variable below is local to
            //the method.
            int privateVariable = 2;
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " times two is " + (i * privateVariable) + ".");
            }
        }
    }
}
