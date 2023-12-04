package com.akash.low.level.design.designpatterns.Structural.Adapter.payment;

public class Main {
    public static void main(String[] args) {
        PaymentProvider razor = new RazorPayPaymentProvider();
        PaymentProvider payu = new PayUPaymentProvider();

        System.out.println(razor.link());

        PaymentRequest request = PaymentRequest.builder()
                .amount(100)
                .email("aks")
                .name("akash")
                .phone("1234").build();

        String id = razor.pay(request);

        System.out.println(razor.status(id));


    }
}
