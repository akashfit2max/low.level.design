package com.akash.low.level.design.designpatterns.Behavioral.TemplatePattern;

public class PayToFrnd extends PaymentFlow {
    @Override
    public void validatePayment() {
        System.out.println("validate frnd");
    }

    @Override
    public void debitAmount() {
        System.out.println("debit full amount");
    }

    @Override
    public void creditAmount() {
        System.out.println("credit full amount");
    }

    @Override
    public void calculateFees() {
        System.out.println("0 transaction fee");

    }
}
