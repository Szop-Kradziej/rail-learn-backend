package com.raillearn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class TripController {

    Departure departure = new Departure("Warszawa", "04.04.2016", "17:50");
    Route route = new Route(departure, "Olsztyn", new ArrayList<Departure>());
    User user = new User("photo", "Karolka");
    Offer offer = new Offer("Spanish","Hi! Learn spanish with me!");

    List<Trip> trips = new ArrayList<Trip>(){{add(new Trip(0, route, user, offer));}};

    @RequestMapping(value = "/trips", method = RequestMethod.GET)
    public List<Trip> getTrips() {
        return trips;
    }

    @RequestMapping(value = "/trips", method = RequestMethod.POST)
    public Trip postTrip(@RequestBody Trip trip) {
        trips.add(trip);
        return trip;
    }

    @RequestMapping(value = "/trips/{id}/join", method = RequestMethod.POST)
    public Trip postTrip(@PathVariable long id) {
        return trips.get((int) id);
    }
}
