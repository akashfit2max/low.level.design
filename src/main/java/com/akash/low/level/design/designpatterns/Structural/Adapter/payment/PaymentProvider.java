package com.akash.low.level.design.designpatterns.Structural.Adapter.payment;

// step 1 - create common adapter interface
public interface PaymentProvider {
    public String link();

    public String pay(PaymentRequest request);

    public PaymentStatus status(String paymentId);

}
