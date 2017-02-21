package com.raillearn;

public class User {
    private String coverPhoto;
    private String profilePhoto;
    private String name;
    private String id;

    public User(String coverPhoto, String profilePhoto, String name, String id) {
        this.coverPhoto = coverPhoto;
        this.profilePhoto = profilePhoto;
        this.name = name;
        this.id = id;
    }

    public User() {

    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public String getProfilePhoto() {
        return profilePhoto;
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

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
