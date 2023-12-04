package com.akash.low.level.design.designpatterns.Structural.Adapter.payment;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class PaymentRequest {
    private double amount;
    private String name;
    private String email;
    private String phone;
}
