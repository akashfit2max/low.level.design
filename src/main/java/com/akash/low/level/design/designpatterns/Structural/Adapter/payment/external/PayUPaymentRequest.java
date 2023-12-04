package com.akash.low.level.design.designpatterns.Structural.Adapter.payment.external;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PayUPaymentRequest {
    private Double amount;
    private String email;
    private String name;

}
