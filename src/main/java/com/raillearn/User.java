package com.raillearn;

public class User {
    private final String photo;
    private final String name;

    public User(String photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }
}
