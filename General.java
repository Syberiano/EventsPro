package com.mycompany.eventspro;

public class General extends TicketSale {

    public General(String eventName, int quantity, double unitPrice) {
        super(eventName, quantity, unitPrice);
    }

    @Override
    public void validateEntry() {
        System.out.println("General ticket validated.");
    }

    @Override
    public void markSoldOut() {
        System.out.println("General tickets sold out.");
    }

    @Override
    public void showSales() {
        System.out.println("General tickets sales shown.");
    }
}
