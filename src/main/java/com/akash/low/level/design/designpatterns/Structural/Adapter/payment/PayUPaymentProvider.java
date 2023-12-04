package com.akash.low.level.design.designpatterns.Structural.Adapter.payment;

import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.PayUApi;
import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.PayUPaymentRequest;
import com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external.PayUPaymentStatus;

public class PayUPaymentProvider implements PaymentProvider {

    private PayUApi payUApi = new PayUApi();

    @Override
    public String link() {
        return payUApi.generateLink();
    }

    @Override
    public String pay(PaymentRequest request) {
        return payUApi.makePayment(makeRequest(request));
    }

    private PayUPaymentRequest makeRequest(PaymentRequest request) {
        return PayUPaymentRequest.builder()
                .amount(request.getAmount())
                .email(request.getEmail())
                .name(request.getName()).build();
    }

    @Override
    public PaymentStatus status(String paymentId) {
        return getStatus(payUApi.checkStatus(paymentId));
    }

    private PaymentStatus getStatus(PayUPaymentStatus payUPaymentStatus) {
        if (payUPaymentStatus == PayUPaymentStatus.OK) {
            return PaymentStatus.OK;
        }
        return PaymentStatus.ERROR;
    }
}
