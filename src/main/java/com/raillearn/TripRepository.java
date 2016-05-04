package com.raillearn;

import java.util.ArrayList;
import java.util.List;

public class TripRepository {

    Departure departure = new Departure("Warszawa", "04.04.2016", "17:50");
    Route route = new Route(departure, "Olsztyn", new ArrayList<Departure>());
    User user = new User("photo", "Karolka");
    Offer offer = new Offer("Spanish","Hi! Learn spanish with me!");

    List<Trip> trips = new ArrayList<Trip>(){{add(new Trip(0, route, user, offer));}};

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
