package com.akash.low.level.design.designpatterns.Structural.facade;

// facade calss
public class OrderProcessor {


    private PaymentService paymentService;
    private RecommendationService recommendationService;
    private WareHouseProcessor wareHouseProcessor;

    public void process() {
        wareHouseProcessor.process();
        paymentService.makePayment();
        recommendationService.recommend();
    }
}
