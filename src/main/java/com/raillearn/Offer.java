package com.raillearn;

public class Offer {
    private String title;
    private String description;

    public Offer(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Offer() {

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
