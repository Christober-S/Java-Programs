package christober.learning.absraction;

public class Main  {
    public static void main(String[] args) {
        com.christober.learning.absraction.Products product = new com.christober.learning.absraction.Products() {
            @Override
            public void productId() {

            }

            @Override
            public void productName() {

            }
        };
        product.productId();
        product.productName();
    }

}
