package com.akash.low.level.design.designpatterns.Structural.FacadeDS;

public class OrderFacade {
    private MakePayment makePayment;
    private Product product;
    private Invoice invoice;

    public OrderFacade() {
        this.makePayment = new MakePayment();
        this.product = new Product();
        this.invoice = new Invoice();
    }

    public void creatOrder() {
        product.getProduct();
        makePayment.makeP();
        invoice.getInvoice();
    }
}
