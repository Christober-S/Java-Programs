package christober.learning.absraction;

public class Cart extends Payment {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.payment();
    }

    @Override
    public void payment() {
        System.out.println("Payment done using Cart");
    }
}
