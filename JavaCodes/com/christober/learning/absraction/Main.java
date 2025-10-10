package com.christober.learning.absraction;

public class Main  {
    public static void main(String[] args) {
        Products product = new Products() {
            @Override
            void productId() {
                System.out.println("Product ID: 12345");
            }
            @Override
            void productName() {
                System.out.println("Product Name: Laptop");
            }
        };
        product.productId();
        product.productName();
    }

}
