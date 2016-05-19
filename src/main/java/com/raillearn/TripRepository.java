package com.raillearn;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

public class TripRepository {

    private AtomicInteger id = new AtomicInteger(0);
    List<Trip> trips = new ArrayList<Trip>();

    public List<Trip> findAll() {
        return trips;
    }

    public Trip save(Trip trip) {
        String tripId = generateNewTripId().toString();
        trip.setId(tripId);

        trips.add(trip);
        return trip;
    }

    private Integer generateNewTripId() {
        return id.incrementAndGet();
    }

    public Trip findOne(String id) {
        int index = getTripIndex(id);
        return trips.get(index);
    }

    private int getTripIndex(String id) {
        for (Trip trip : trips) {
            if (trip.getId().equals(id)) {
                return trips.indexOf(trip);
            }
        }

        throw new NoSuchElementException("There is no element with such an id");
    }

    public Trip updateOne(Trip trip) {
        int index = getTripIndex(trip.getId());
        trips.remove(index);
        trips.add(index, trip);
        return trip;
    }

    public String deleteOne(String id) {
        int index = getTripIndex(id);
        trips.remove(index);
        return id;
    }
}
