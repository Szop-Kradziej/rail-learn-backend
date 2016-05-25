package com.raillearn;

public class User {
    private String coverPhoto;
    private String name;
    private String id;

    public User(String coverPhoto, String name, String id) {
        this.coverPhoto = coverPhoto;
        this.name = name;
        this.id = id;
    }

    public User() {

    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
