package com.akash.low.level.design.designpatterns.Behavioral.TemplatePattern;

public abstract class PaymentFlow {
    public abstract void validatePayment();

    public abstract void debitAmount();

    public abstract void creditAmount();

    public abstract void calculateFees();

    public final void send() {
        validatePayment();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
