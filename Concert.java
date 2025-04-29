package com.mycompany.eventspro;

public class Concert extends Event {

    public Concert(String name, String date, String location, int capacity, String time, String type, String artist) {
        super(name, date, location, capacity, time, type, artist);
    }

    @Override
    public void editEvent(String eventNameToEdit) {
        System.out.println("Editing concert event.");
    }
}
