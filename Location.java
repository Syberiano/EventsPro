package com.mycompany.eventspro;

public class Location {
    private String name;
    private String address;
    private int capacity;

    public Location(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public void displayLocation() {
        System.out.println(name + " located at " + address + ", Capacity: " + capacity);
    }
}
