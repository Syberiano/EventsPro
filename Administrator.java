package com.mycompany.eventspro;

public class Administrator extends Person {
    private String employeeId;

    public Administrator(String name, String id, String email, String phone, String employeeId) {
        super(name, id, email, phone);
        this.employeeId = employeeId;
    }

    public void register() {
        System.out.println(name + " registered as administrator.");
    }

    public void viewEventInfo() {
        Event.showEvents();
    }

    public void modifyEvent() {
        System.out.println("Event modified by administrator.");
    }

    @Override
    public void uploadContactInfo() {
        System.out.println("Uploading administrator contact info.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Administrator: " + name);
    }

    @Override
    public void showHistory() {
        System.out.println("Administrator event history.");
    }
}
