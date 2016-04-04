package com.raillearn;

public class Offer {
    private final String title;
    private final String description;

    public Offer(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
