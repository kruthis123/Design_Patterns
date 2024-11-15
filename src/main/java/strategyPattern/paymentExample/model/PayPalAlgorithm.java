package strategyPattern.paymentExample.model;

import strategyPattern.paymentExample.controller.Payment;

public class PayPalAlgorithm implements Payment {
    private String email;
    private String password;

    public PayPalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " being paid with PayPal");
    }
}
