package christober.learning.relationship.hasarelationship;

public class Test {
    static void main() {
        Bike bike = new Bike("XL", 100, 100, "TwoStroke");
        System.out.println(bike.brand);
        System.out.println(bike.price);
        System.out.println(bike.engine.cc);
        System.out.println(bike.engine.strokeType);
    }
}
