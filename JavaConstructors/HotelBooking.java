// Hotel Booking System with multiple constructors
class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // parameterized constructor
    HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    // copy constructor
    HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    void bookingInfo() {
        System.out.println(guestName + " booked a " + roomType + " room for " + nights + " nights.");
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Amit", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.bookingInfo();
        b2.bookingInfo();
        b3.bookingInfo();
    }
}