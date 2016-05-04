package com.raillearn;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TripController {

    TripRepository tripRepository = new TripRepository();

    @RequestMapping(value = "/trips", method = RequestMethod.GET)
    public List<Trip> getTrips() {
        return tripRepository.findAll();
    }

    @RequestMapping(value = "/trips", method = RequestMethod.POST)
    public Trip postTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }

    @RequestMapping(value = "/trips/{id}/join", method = RequestMethod.POST)
    public Trip postTrip(@PathVariable long id) {
        return tripRepository.findOne(id);
    }
}
