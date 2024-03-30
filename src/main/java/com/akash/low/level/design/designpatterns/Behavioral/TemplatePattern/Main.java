package com.akash.low.level.design.designpatterns.Behavioral.TemplatePattern;

public class Main {
    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFrnd();
        paymentFlow.send();
    }
}
