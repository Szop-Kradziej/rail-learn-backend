package com.raillearn;

public class Trip {

    private final long id;
    private final String cityFrom;
    private final String cityTo;

    public Trip(long id, String cityFrom, String cityTo) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
    }

    public long getId() {
        return id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }
}
