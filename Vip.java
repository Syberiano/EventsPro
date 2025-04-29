package com.mycompany.eventspro;

public class Vip extends TicketSale {
    private String benefit;

    public Vip(String eventName, int quantity, double unitPrice, String benefit) {
        super(eventName, quantity, unitPrice);
        this.benefit = benefit;
    }

    @Override
    public void validateEntry() {
        System.out.println("VIP ticket validated.");
    }

    @Override
    public void markSoldOut() {
        System.out.println("VIP tickets sold out.");
    }

    @Override
    public void showSales() {
        System.out.println("VIP tickets sales shown.");
    }
}
