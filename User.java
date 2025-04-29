package com.mycompany.eventspro;

public class User extends Person {
    public User(String name, String id, String email, String phone) {
        super(name, id, email, phone);
    }

    @Override
    public void uploadContactInfo() {
        System.out.println("Uploading user contact info.");
    }

    @Override
    public void displayInfo() {
        System.out.println("User: " + name);
    }

    @Override
    public void showHistory() {
        System.out.println("User event history.");
    }
}
