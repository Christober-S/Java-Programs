package FoodDeliveryApp;

public class Burger extends Foods{
    public Burger(String name, double price) {
        super(name, price);
        this.price = price;
        this.name = name;
    }
    public void extraCheese() {
        this.price += 1.5;
    }
    public void extraSauce() {
        this.price += 1.0;
    }
    public void extraLarge(){
        this.price += 2.5;
    }
}
