package com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external;

public class PayUApi {
    public String generateLink() {
        return "Link";
    }

    public String makePayment(PayUPaymentRequest request) {
        System.out.println("making payment");
        return "id";
    }

    public PayUPaymentStatus checkStatus(String paymentId) {
        return PayUPaymentStatus.OK;
    }
}
