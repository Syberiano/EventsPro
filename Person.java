package com.mycompany.eventspro;

public abstract class Person {
    protected String name;
    protected String id;
    protected String email;
    protected String phone;

    public Person(String name, String id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    public abstract void uploadContactInfo();
    public abstract void displayInfo();
    public abstract void showHistory();
}
