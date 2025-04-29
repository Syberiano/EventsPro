package com.mycompany.eventspro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        String role = "";

        while (running) {
            System.out.println("Welcome to the Event Management System!");
            System.out.print("Enter your role (admin / organizer / user): ");
            role = sc.nextLine().toLowerCase();

            boolean roleMenu = true;
            while (roleMenu) {
                System.out.println("\nEvent Management System");
                System.out.println("1. Create Event");
                System.out.println("2. Show Events");
                System.out.println("3. Edit Event");
                System.out.println("4. Delete Event");
                System.out.println("5. Buy Ticket");
                System.out.println("6. Exit");
                System.out.println("7. Switch Role");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        if (role.equals("admin") || role.equals("organizer")) {
                            System.out.print("Enter event name: ");
                            String name = sc.nextLine();
                            System.out.print("Enter event date (YYYY-MM-DD): ");
                            String date = sc.nextLine();
                            System.out.print("Enter event location: ");
                            String location = sc.nextLine();
                            System.out.print("Enter event capacity: ");
                            int capacity = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter event time (HH:MM): ");
                            String time = sc.nextLine();
                            System.out.print("Enter event type (concert, festival, conference): ");
                            String type = sc.nextLine();
                            System.out.print("Enter artist or speaker name: ");
                            String artist = sc.nextLine();

                            Event newEvent = null;
                            switch (type.toLowerCase()) {
                                case "concert":
                                    newEvent = new Concert(name, date, location, capacity, time, type, artist);
                                    break;
                                case "festival":
                                    newEvent = new Festival(name, date, location, capacity, time, type, artist);
                                    break;
                                case "conference":
                                    newEvent = new Conference(name, date, location, capacity, time, type, artist);
                                    break;
                                default:
                                    System.out.println("Invalid event type.");
                                    break;
                            }

                            if (newEvent != null) {
                                Event.addEvent(newEvent);
                                System.out.println("Event created successfully!");
                            }
                        } else {
                            System.out.println("Access denied. Only admin or organizer can create events.");
                        }
                        break;

                    case 2: 
                        Event.showEvents();
                        break;

                    case 3: 
                        if (role.equals("admin") || role.equals("organizer")) {
                            System.out.print("Enter the event name to edit: ");
                            String eventNameToEdit = sc.nextLine();
                            Event eventToEdit = Event.searchEvent(eventNameToEdit);
                            if (eventToEdit != null) {
                                eventToEdit.editEvent(eventNameToEdit);
                            } else {
                                System.out.println("Event not found.");
                            }
                        } else {
                            System.out.println("Access denied. Only admin or organizer can edit events.");
                        }
                        break;

                    case 4:
                        if (role.equals("admin") || role.equals("organizer")) {
                            System.out.print("Enter the event name to delete: ");
                            String eventNameToDelete = sc.nextLine();
                            Event.deleteEvent(eventNameToDelete);
                        } else {
                            System.out.println("Access denied. Only admin or organizer can delete events.");
                        }
                        break;

                    case 5: 
                        System.out.print("Enter the event name you want to buy a ticket for: ");
                        String eventName = sc.nextLine();
                        Event selectedEvent = Event.searchEvent(eventName);
                        if (selectedEvent != null) {
                            System.out.println("Ticket purchased successfully for: " + selectedEvent.name);
                        } else {
                            System.out.println("Event not found.");
                        }
                        break;

                    case 6:
                        running = false;
                        System.out.println("Exiting system... Goodbye!");
                        break;

                    case 7:
                        System.out.println("You are now switching your role...");
                        roleMenu = false; 
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }

         
                if (roleMenu) {
                    System.out.println("Press Enter to continue...");
                    sc.nextLine(); 
                }
            }
        }
        sc.close();
    }
}
