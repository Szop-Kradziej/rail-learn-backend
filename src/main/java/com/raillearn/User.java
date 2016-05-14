package com.raillearn;

public class User {
    private String photo;
    private String name;
    private String id;

    public User(String photo, String name) {
        this.photo = photo;
        this.name = name;
    }

    public User() {

    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
