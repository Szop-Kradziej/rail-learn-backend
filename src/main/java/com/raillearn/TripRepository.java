package com.raillearn;

import java.util.ArrayList;
import java.util.List;

public class TripRepository {

    List<Trip> trips = new ArrayList<Trip>();

    public List<Trip> findAll() {
        return trips;
    }

    public Trip save(Trip trip) {
        trips.add(trip);
        return trip;
    }

    public Trip findOne(long id) {
        return trips.get((int) id);
    }
}
