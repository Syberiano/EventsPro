package com.mycompany.eventspro;

import java.util.ArrayList;
import java.util.List;

public class ArtistSpeaker extends Person {
    private String type;
    private List<String> history = new ArrayList<>();

    public ArtistSpeaker(String name, String id, String email, String phone, String type) {
        super(name, id, email, phone);
        this.type = type;
    }

    public void register() {
        System.out.println(name + " registered as artist/speaker.");
    }

    public void modifyRequirement() {
        System.out.println("Requirements modified.");
    }

    public void uploadRequirement() {
        System.out.println("Requirements uploaded.");
    }

    @Override
    public void uploadContactInfo() {
        System.out.println("Uploading artist/speaker contact info.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Artist/Speaker: " + name);
    }

    @Override
    public void showHistory() {
        System.out.println("Artist/Speaker history: " + history.toString());
    }
}

