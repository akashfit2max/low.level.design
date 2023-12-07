package com.akash.low.level.design.designpatterns.Structural.facade;

// additional facade
public class WareHouseProcessor {
    private InventoryService inventoryService;
    private AnalyticsService analyticsService;

    public void process() {
        inventoryService.checkInventory();
        analyticsService.analize();
    }
}
