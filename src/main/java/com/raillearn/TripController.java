package com.raillearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    Departure departure = new Departure("Warszawa", "04.04.2016", "17:50");
    Route route = new Route(departure, "Olsztyn", new ArrayList<Departure>());
    User user = new User("photo", "Karolka");
    Offer offer = new Offer("Spanish","Hi! Learn spanish with me!");

    @RequestMapping("/trips")
    public List<Trip> trips() {
        return Collections.singletonList(new Trip(0, route, user, offer));
    }
}
