package com.mycompany.eventspro;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;

public abstract class Event {
    protected String name;
    protected String date;
    protected String location;
    protected int capacity;
    protected String time;
    protected String type;
    protected String artist;

    private static List<Event> eventList = new ArrayList<>();

   
    public Event(String name, String date, String location, int capacity, String time, String type, String artist) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.capacity = capacity; 
        this.time = time;
        this.type = type;
        this.artist = artist;
    }

    public static void addEvent(Event event) {
        eventList.add(event);
    }

    public static void showEvents() {
        if (eventList.isEmpty()) {
            System.out.println("No events available.");
        } else {
            for (Event e : eventList) {
                System.out.println(e);
            }
        }
    }

    public static Event searchEvent(String name) {
        for (Event e : eventList) {
            if (e.name.equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public static void deleteEvent(String name) {
        Event event = searchEvent(name);
        if (event != null) {
            eventList.remove(event);
            System.out.println("Event deleted successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }

    @Override
    public String toString() {
        return "Event: " + name + ", Date: " + date + ", Location: " + location + ", Type: " + type + ", Artist: " + artist;
    }

    public abstract void editEvent(String eventNameToEdit);
}
