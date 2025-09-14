package CarPackage;

public class Bike extends Vehicle {
    public void calculateFare(double distance) {
        double fare = distance * 5; // Assuming a rate of 1.5 per kilometer
        System.out.println("Bike fare for " + distance + " km: $" + fare);
    }
}
