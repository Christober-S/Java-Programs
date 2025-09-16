package Interface;

public class DinningRestaurant implements Restaurant {
    @Override
    public void orderConfirmed() {
        System.out.println("Your Order Confirmed, Thanks for ordering");
    }
    @Override
    public void foodPreparation() {
        System.out.println("Food Preparation (Please wait for 20 minutes)");
    }
    @Override
    public void readyForPickup() {
        System.out.println("Order is ready to pickup");
    }
}

