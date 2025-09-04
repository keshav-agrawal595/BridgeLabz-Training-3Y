// Car Rental System with cost calculation
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateCost() {
        double rate = 1000; // cost per day
        return rentalDays * rate;
    }

    void rentalInfo() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days.");
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Rahul", "Swift", 5);
        cr.rentalInfo();
    }
}
