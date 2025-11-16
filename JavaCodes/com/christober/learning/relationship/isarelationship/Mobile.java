package christober.learning.relationship.isarelationship;

public class Mobile {
    String brand;
    int ram;
    Sim simCard;
    Mobile(String brand, int ram){
        this.brand = brand;
        this.ram = ram;
    }

    public void addSim(String network){
        simCard = new Sim(network);
    }
}
