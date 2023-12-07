package com.akash.low.level.design.designpatterns.Structural.facade;

public class OrderManagerImpl implements OrderManager {

    private OrderProcessor processor;

    @Override
    public void creatOrder() {
        processor.process();
    }

//    private InventoryService inventoryService;
//    private AnalyticsService analyticsService;
//    private PaymentService paymentService;
//    private RecommendationService recommendationService;
//
//    @Override
//    public void creatOrder() {
//        inventoryService.checkInventory();
//        analyticsService.analize();
//        paymentService.makePayment();
//        recommendationService.recommend();
//    }


}

// god class - not maintained
// testing
// extensibility
