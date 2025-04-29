package com.mycompany.eventspro;

public class Organizer extends Person {
    private String employeeId;

    public Organizer(String name, String id, String email, String phone, String employeeId) {
        super(name, id, email, phone);
        this.employeeId = employeeId;
    }

    public void createEvent() {
        System.out.println("Organizer creating an event.");
    }

    @Override
    public void uploadContactInfo() {
        System.out.println("Uploading organizer contact info.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Organizer: " + name);
    }

    @Override
    public void showHistory() {
        System.out.println("Organizer event history.");
    }
}
