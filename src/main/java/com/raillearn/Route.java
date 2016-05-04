package com.raillearn;

import java.util.List;

public class Route {
    private Departure departure;
    private String arrival;

    public Route(Departure departure, String arrival, List<Departure> stops) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Route () {

    }

    public Departure getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setDeparture(Departure departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }
}
