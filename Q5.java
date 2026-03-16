class Car {
    String brand;

    // Constructor
    Car(String brand) {
        this.brand = brand;
    }
}

public class Q5 {

    // Method to park car in first available null slot
    public static void parkCar(Car[] lot, Car newCar) {

        for (int i = 0; i < lot.length; i++) {

            if (lot[i] == null) {

                lot[i] = newCar;

                System.out.println("Car " + newCar.brand 
                        + " parked successfully at slot " + i + ".");

                return;  // Stop after parking
            }
        }

        System.out.println("Parking Lot Full");
    }

    public static void main(String[] args) {

        Car[] lot = new Car[4];

        // Initialize with 2 cars
        lot[0] = new Car("Toyota");
        lot[1] = new Car("Honda");
        // lot[2] and lot[3] remain null

        // New arriving car
        Car newCar = new Car("Ford");

        // Park the car
        parkCar(lot, newCar);
    }
}