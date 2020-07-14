import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaCollections {
    public static void main(String[] args) {
        //Demo on Collections class, Collection interface and the Binary Search on a sorted List.
//        Theater piscatawayAmcTheater = new Theater("Piscataway", 8, 12);
//        //piscatawayAmcTheater.printSeats();
//        if (piscatawayAmcTheater.reserveSeat("D06")) {
//            System.out.println("Please make the payment.");
//        } else {
//            System.out.println("Sorry, The requested seat is no longer available.");
//        }
//        if (piscatawayAmcTheater.reserveSeat("D06")) {
//            System.out.println("Please make the payment.");
//        } else {
//            System.out.println("Sorry, The requested seat is no longer available.");
//        }
//        piscatawayAmcTheater.reserveSeat("45FD");

        //Demo on shallow copy of a list.
//        Theater edisonAmcTheater = new Theater("Edison", 24, 12);
//        ArrayList<Theater.Seat> edisonAmcTheaterSeatsShallowCopy = new ArrayList<>(edisonAmcTheater.getSeats());
//        printTheaterSeatList(edisonAmcTheaterSeatsShallowCopy);
//
//        edisonAmcTheater.reserveSeat("D07");
//        if (!edisonAmcTheaterSeatsShallowCopy.get(42).reserve()) {
//            System.out.println("The seat " + edisonAmcTheaterSeatsShallowCopy.get(42).getNumber() + " is already reserved.");
//        }

        //Demo on bubble sort algorithm.
        Theater edisonAmcTheater = new Theater("Edison", 24, 12);
        Collections.shuffle(edisonAmcTheater.getSeats());
        printTheaterSeatList(edisonAmcTheater.getSeats());
        bubbleSort(edisonAmcTheater.getSeats());
        printTheaterSeatList(edisonAmcTheater.getSeats());
    }

    private static void bubbleSort(List<? extends Theater.Seat> listToSort) {
        for (int i = 0; i < listToSort.size() - 1; i++) {
            for (int j = i + 1; j < listToSort.size(); j++) {
                if (listToSort.get(i).compareTo(listToSort.get(j)) > 0) {
                    Collections.swap(listToSort, i, j);
                }
            }
        }
    }

    private static void printTheaterSeatList(List<Theater.Seat> seats) {
        for (Theater.Seat seat : seats) {
            System.out.print(" " + seat.getNumber());
        }
        System.out.println();
        System.out.println("=========================================================================================");
    }

}
