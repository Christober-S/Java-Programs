package FoodDeliveryApp;

public class Pizza extends Foods {
    public Pizza(String name, double price) {
        super(name, price);
        this.price = price;
        this.name = name;
    }

    public void extraCheese() {
        this.price += 2.0;
    }
    public void extraVeggies() {
        this.price += 1.5;
    }
    public void extraTopping() {
        this.price += 3.0;
    }
}
