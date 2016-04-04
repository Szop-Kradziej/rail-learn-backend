package com.raillearn;

public class Departure {
    private final String name;
    private final String date;
    private final String time;

    public Departure(String name, String date, String time) {
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
