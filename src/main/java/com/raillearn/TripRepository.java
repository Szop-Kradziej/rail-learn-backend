package com.raillearn;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

public class TripRepository {

    private AtomicInteger id = new AtomicInteger(0);
    List<Trip> trips = new ArrayList<Trip>();

    public List<Trip> findAll(String userId) {
        List<Trip> userTrips = new ArrayList<Trip>();
        for (Trip trip: trips) {
            if(isTripFreeToJoin(trip) || isUserJoinedTrip(trip, userId) || isUserTripOffer(trip, userId)) {
                userTrips.add(trip);
            }
        }
        return userTrips;
    }

    private boolean isTripFreeToJoin(Trip trip) {
        return trip.getJoinedUser().equals(Trip.NONE_JOINED_USER);
    }

    private boolean isUserJoinedTrip(Trip trip, String userId) {
        return trip.getJoinedUser().equals(userId);
    }

    private boolean isUserTripOffer(Trip trip, String userId) {
        return trip.getUser().getId().equals(userId);
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

    public Trip joinOne(String tripId, String userId) {
        int index = getTripIndex(tripId);
        Trip trip = trips.get(index);
        if(isTripFreeToJoin(trip)) {
            trip.setJoinedUser(userId);
        }
        return updateOne(trip);
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

    public Trip cancelJoinOne(String id) {
        int index = getTripIndex(id);
        Trip trip = trips.get(index);
        trip.setJoinedUser(Trip.NONE_JOINED_USER);
        return updateOne(trip);
    }
}
