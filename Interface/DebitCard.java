package Interface;

public class DebitCard implements Amazon{
    @Override
    public void payment() {
        System.out.println("Payment done using Debit Card");
    }
}
