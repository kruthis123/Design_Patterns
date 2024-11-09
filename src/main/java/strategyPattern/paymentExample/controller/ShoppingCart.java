package strategyPattern.paymentExample.controller;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int billAmount;
    private final List<Product> productList = new ArrayList<>();

    public ShoppingCart() {
        this.billAmount = 0;
    }

    public void addProduct(Product p) {
        productList.add(p);
        System.out.println("Adding Product with price" + p.getPrice());
        this.billAmount += p.getPrice();
    }

    public void removeProduct(Product p) {
        productList.remove(p);
        System.out.println("Removing Product with price" + p.getPrice());
        this.billAmount -= p.getPrice();
    }

    public void pay(Payment paymentType) {
        paymentType.pay(this.billAmount);
    }
}
