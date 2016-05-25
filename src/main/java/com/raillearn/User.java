package com.raillearn;

public class User {
    private String coverPhoto;
    private String profilPhoto;
    private String name;
    private String id;

    public User(String coverPhoto, String profilPhoto, String name, String id) {
        this.coverPhoto = coverPhoto;
        this.profilPhoto = profilPhoto;
        this.name = name;
        this.id = id;
    }

    public User() {

    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public String getProfilPhoto() {
        return profilPhoto;
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

    public void setProfilPhoto(String profilPhoto) {
        this.profilPhoto = profilPhoto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
}
