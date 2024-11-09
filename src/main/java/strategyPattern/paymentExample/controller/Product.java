package strategyPattern.paymentExample.controller;

public class Product {
    private int price;
    private String upcCode;

    public Product(String upcCode, int price) {
        this.price = price;
        this.upcCode = upcCode;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
