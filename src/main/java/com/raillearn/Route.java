package com.raillearn;

import java.util.List;

public class Route {
    private final Departure departure;
    private final String arrival;
    private final List<Departure> stops;

    public Route(Departure departure, String arrival, List<Departure> stops) {
        this.departure = departure;
        this.arrival = arrival;
        this.stops = stops;
    }

    public Departure getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public List<Departure> getStops() {
        return stops;
    }
}
