package CarPackage;

public class Car extends  Vehicle {
    public void calculateFare(double distance) {
        double fare = distance * 10; // Assuming a rate of 1.5 per kilometer
        System.out.println("Car fare for " + distance + " km: $" + fare);
    }
}
