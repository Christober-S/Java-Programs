package CarPackage;

public class Vehicle {
    public void calculateFare(double distance) {
        double fare = distance * 8; // Assuming a rate of 1.5 per kilometer
        System.out.println("Vehicle fare for " + distance + " km: $" + fare);
    }
}
