package CarPackage;
public class Auto extends  Vehicle {
    public void calculateFare(double distance) {
        double fare = distance * 7; // Assuming a rate of 1.5 per kilometer
        System.out.println("Auto fare for " + distance + " km: $" + fare);
    }
}
