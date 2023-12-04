package com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external;

public class RazorPayApi {
    public String generateLink() {
        return "Link";
    }

    public String makePayment(double amount, String email) {
        System.out.println("making payment");
        return "id";
    }

    public RazorPayPaymentStatus checkStatus(String paymentId) {
        return RazorPayPaymentStatus.SUCCESS;
    }
}
