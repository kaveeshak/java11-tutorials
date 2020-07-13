import jdk.swing.interop.SwingInterOpUtils;

public class JavaCollections {
    public static void main(String[] args) {
        //Demo on Collections class, Collection interface and the Binary Search on a sorted List.
        Theater piscatawayAmcTheater = new Theater("Piscataway", 8, 12);
//        piscatawayAmcTheater.getSeats();
        if (piscatawayAmcTheater.reserveSeat("D06")) {
            System.out.println("Please make the payment.");
        } else {
            System.out.println("Sorry, The requested seat is no longer available.");
        }
        if (piscatawayAmcTheater.reserveSeat("D06")) {
            System.out.println("Please make the payment.");
        } else {
            System.out.println("Sorry, The requested seat is no longer available.");
        }
        piscatawayAmcTheater.reserveSeat("45FD");
    }
}
