package com.akash.low.level.design.designpatterns.Behavioral.TemplatePattern;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void validatePayment() {
        System.out.println("validate merhant");
    }

    @Override
    public void debitAmount() {
        System.out.println("demit amount for merchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit amount to merchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("5% transaction free charged....");

    }
}
