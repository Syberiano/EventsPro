package com.mycompany.eventspro;

public class Festival extends Event {

    public Festival(String name, String date, String location, int capacity, String time, String type, String artist) {
        super(name, date, location, capacity, time, type, artist);
    }

    @Override
    public void editEvent(String eventNameToEdit) {
        System.out.println("Editing festival event.");
    }
}
