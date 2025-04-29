package com.mycompany.eventspro;

public class Preferential extends TicketSale {

    public Preferential(String eventName, int quantity, double unitPrice) {
        super(eventName, quantity, unitPrice);
    }

    @Override
    public void validateEntry() {
        System.out.println("Preferential ticket validated.");
    }

    @Override
    public void markSoldOut() {
        System.out.println("Preferential tickets sold out.");
    }

    @Override
    public void showSales() {
        System.out.println("Preferential tickets sales shown.");
    }
}
