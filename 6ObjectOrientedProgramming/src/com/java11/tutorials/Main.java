package com.java11.tutorials;

import com.java11.exercises.*;

public class Main {

    public static void main(String [] args) {
        //Classes
        Car toyotaCar = new Car();
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("Corolla");
        System.out.println(toyotaCar.getModel());
        toyotaCar.setModel("4Runner");
        System.out.println(toyotaCar.getModel());

        //Testing SimpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(12);
        simpleCalculator.setSecondNumber(3);
        System.out.println(simpleCalculator.getAdditionResult());
        System.out.println(simpleCalculator.getMultiplicationResult());
        System.out.println(simpleCalculator.getDivisionResult());
        simpleCalculator.setSecondNumber(0);
        System.out.println(simpleCalculator.getDivisionResult());

        //Testing Person.
        Person person = new Person();
        person.setAge(103);
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        person.setFirstName("Venura");
        person.setLastName("Komangodage");
        person.setAge(15);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());

        //Testing BankAccount.
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(-10);
        bankAccount.setBalance(100);
        bankAccount.deposit(-34);
        bankAccount.deposit(45);
        bankAccount.withdrawal(1000);
        bankAccount.withdrawal(10);
        System.out.println("Balance: " + bankAccount.getBalance());

        //Testing Constructors.
        BankAccount kaveeshasAccount = new BankAccount("5687429", "Venura K Komangodage", "kaveeshak@gmail.com", "732-763-0603", 0.00);
        System.out.println(kaveeshasAccount.getAccountNumber());
        System.out.println(kaveeshasAccount.getCustomerName());
        System.out.println(kaveeshasAccount.getEmail());
        System.out.println(kaveeshasAccount.getPhoneNumber());
        System.out.println(kaveeshasAccount.getBalance());

        //Testing Constructors - this().
        BankAccount testBankAccount = new BankAccount();
        System.out.println(testBankAccount.getCustomerName());
        System.out.println(testBankAccount.getBalance());

        //Testing VipCustomer.
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println("vipCustomer1");
        System.out.println(vipCustomer1.getName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Venura", 20000.00);
        System.out.println("vipCustomer2");
        System.out.println(vipCustomer2.getName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());

        //Testing Wall.
        Wall kitchenWall1 = new Wall();
        System.out.println(kitchenWall1.getArea());
        Wall kitchenWall2 = new Wall(-3.2, -0.2);
        System.out.println(kitchenWall1.getArea());
        kitchenWall2.setHeight(10);
        kitchenWall2.setWidth(8);
        System.out.println(kitchenWall2.getArea());

        //Testing Point.
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2, 2));
        Point point = new Point();
        System.out.println(point.distance());

        //Testing Carpet Cost Calculator.
        System.out.println();
        System.out.println("Testing Carpet Cost Calculator...");
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println(calculator.getTotalCost());

        //Testing Complex Operations.
        System.out.println();
        System.out.println("Testing Complex Operations...");
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1, 1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        one.subtract(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());

        //Inheritance demo.
        System.out.println();
        System.out.println("Inheritance demo...");
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dog.eat(); //This is defined in the animal class.
        dog.walk();
        dog.run();

        //Testing instance reference demo.
        System.out.println();
        System.out.println("Instance reference...");
        House blueHouse = new House("Blue");
        House yellowHouse = blueHouse;
        System.out.println(blueHouse.getColor());
        System.out.println(yellowHouse.getColor());
        yellowHouse.setColor("Red");
        System.out.println(blueHouse.getColor());
        System.out.println(yellowHouse.getColor());

        //Testing inheritance challenge.
        System.out.println();
        System.out.println("Testing inheritance challenge...");
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

        //Testing Cylinder exercise.
        System.out.println();
        System.out.println("Testing Cylinder exercise...");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        //Testing Pool Area exercise.
        System.out.println();
        System.out.println("Testing Pool Area exercise...");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
