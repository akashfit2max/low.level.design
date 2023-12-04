package com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external;

public class RazorPayApiv2 {
    public String generateLink() {
        return "Link";
    }

    public String prePay(double amount, String email) {
        System.out.println("making payment");
        return "id";
    }

    public void postPay(String id) {
        System.out.println("post payment");
    }

    public RazorPayPaymentStatus checkStatus(String paymentId) {
        return RazorPayPaymentStatus.SUCCESS;
    }
}
