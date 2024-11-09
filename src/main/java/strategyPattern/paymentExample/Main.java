package strategyPattern.paymentExample;

import strategyPattern.paymentExample.controller.Product;
import strategyPattern.paymentExample.controller.ShoppingCart;
import strategyPattern.paymentExample.model.CreditCardAlgorithm;
import strategyPattern.paymentExample.model.PayPalAlgorithm;

public class Main {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        Product apple = new Product("apl", 100);
        Product mango = new Product("mng", 200);

        sc.addProduct(apple);
        sc.addProduct(mango);

        sc.pay(new PayPalAlgorithm("email", "password"));
        sc.pay(new CreditCardAlgorithm("name", "123456"));
    }
}
