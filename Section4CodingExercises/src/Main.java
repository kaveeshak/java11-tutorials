public class Main {

    public static void main(String[] args) {

        //Testing AreaCalculator
        System.out.println(AreaCalculator.area(-2));
        System.out.println(AreaCalculator.area(45.32));
        System.out.println(AreaCalculator.area(-43, 54.32));
        System.out.println(AreaCalculator.area(32.12, -54.32));
        System.out.println(AreaCalculator.area(34.21, 12.43));

        //Testing MinutesToYearsDaysCalculator
        MinutesToYearsDaysCalculator.printYearsAndDays(-34);
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}
