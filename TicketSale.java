package com.mycompany.eventspro;

public abstract class TicketSale {
    protected String eventName;
    protected int quantity;
    protected double unitPrice;

    public TicketSale(String eventName, int quantity, double unitPrice) {
        this.eventName = eventName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public abstract void validateEntry();
    public abstract void markSoldOut();
    public abstract void showSales();
}
