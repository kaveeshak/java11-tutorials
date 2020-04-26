import com.java11.exercises.Series;

public class Main {
    public static void main(String[] args) {
        //Testing exercise on packages...
        System.out.println("Testing exercise on packages...");
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
    }
}
