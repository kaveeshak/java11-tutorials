import java.util.*;

public class Theater {
    private final String name;
    private List<Seat> seats;

    public Theater(String name, int numberOfRows, int numberOfSeatsPerRow) {
        this.name = name;
        this.seats = new ArrayList<>();
        generateSeats(numberOfRows, numberOfSeatsPerRow);
    }

    private void generateSeats(int numberOfRows, int numberOfSeatsPerRow) {
        int lastRow = 'A' + (numberOfRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= numberOfSeatsPerRow; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber);
        int requestedSeatElement = Collections.binarySearch(seats, requestedSeat);
        if (requestedSeatElement >= 0) {
            return seats.get(requestedSeatElement).reserve();
        }
        System.out.println("There is no such a seat as " + seatNumber + ".");
        return false;
//        for (Seat seat : seats) {
//            if (seat.number.equalsIgnoreCase(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat != null) {
//            return requestedSeat.reserve();
//        }
//        System.out.println("There is no such a seat as " + seatNumber + ".");
//        return false;
    }

    /**
     * Only for testing purposes.
     */
    public void printSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.number);
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private String number;
        private boolean isReserved;

        public Seat(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public boolean reserve() {
            if (!isReserved) {
                isReserved = true;
                System.out.println("The seat " + number + " is reserved.");
                return true;
            }
            return false;
        }

        public boolean cancel() {
            if (isReserved) {
                isReserved = false;
                System.out.println("The reservation for seat " + number + " is cancelled.");
                return true;
            }
            return false;
        }

        @Override
        public int compareTo(Seat seat) {
            return number.compareToIgnoreCase(seat.number);
        }
    }
}
