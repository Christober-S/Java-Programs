package christober.learning.relationship.hasarelationship;

public class Bike {
    String brand;
    double price;
    Engine engine;

    Bike(String brand, double price, int cc, String strokeType) {
        this.brand = brand;
        this.price = price;
        engine = new Engine(cc, strokeType);
    }
}
