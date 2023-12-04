package com.akash.low.level.design.designpatterns.Structural.Adapter.payment;

import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.RazorPayApi;
import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.RazorPayApiv2;
import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.RazorPayPaymentStatus;

// step 2 - create concrete adaptee classes
public class RazorPayPaymentProvider implements PaymentProvider {

    private RazorPayApi api = new RazorPayApi();

    private RazorPayApiv2 apiv2 = new RazorPayApiv2();

    @Override
    public String link() {
        return api.generateLink();
    }

    @Override
    public String pay(PaymentRequest request) {
        String id = apiv2.prePay(request.getAmount(), request.getEmail());
        apiv2.postPay(id);
        return id;
    }

    @Override
    public PaymentStatus status(String paymentId) {
        return getStatus(api.checkStatus(paymentId));
    }

    private PaymentStatus getStatus(RazorPayPaymentStatus status) {
        if (status == RazorPayPaymentStatus.SUCCESS) {
            return PaymentStatus.OK;
        }
        return PaymentStatus.ERROR;
    }
}
