public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        boolean isEqualByThreeDecimalPlaces = false;

        if(((int)(number1 * 1000)) == ((int)(number2 * 1000))) {
            isEqualByThreeDecimalPlaces = true;
        }

        return isEqualByThreeDecimalPlaces;
    }
}