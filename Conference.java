package com.mycompany.eventspro;

public class Conference extends Event {

    public Conference(String name, String date, String location, int capacity, String time, String type, String artist) {
        super(name, date, location, capacity, time, type, artist);
    }

    @Override
    public void editEvent(String eventNameToEdit) {
        System.out.println("Editing conference event.");
    }
}
