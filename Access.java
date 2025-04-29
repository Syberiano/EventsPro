package com.mycompany.eventspro;

public class Access {
    private String eventName;
    private String eventDate;

    public Access(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public void calculateAttendees() {
        System.out.println("Calculating number of attendees...");
    }

    public void validateEntry() {
        System.out.println("Validating entry...");
    }

    public void registerAttendee() {
        System.out.println("Attendee registered.");
    }

    public void generateStatistics() {
        System.out.println("Generating event statistics...");
    }
    public void showTicketSaleRegistration(){
        System.out.println(" view Registration Sale");
        
    }
}
