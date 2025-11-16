package christober.learning.relationship.isarelationship;

public class Test {
    public static void main() {
        Mobile mobile = new Mobile("Realme", 8);
        System.out.println(mobile.brand);
        System.out.println(mobile.ram);
        System.out.println(mobile.simCard);
        mobile.addSim("Vi");
        System.out.println(mobile.simCard.network);
    }
}
