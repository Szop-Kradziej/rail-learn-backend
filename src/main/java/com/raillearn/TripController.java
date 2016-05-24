package com.raillearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TripController {

    @Autowired
    TripRepository tripRepository;
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/trips", method = RequestMethod.GET)
    public List<Trip> getTrips(@RequestParam String user_id) {
        return tripRepository.findAll(user_id);
    }

    @RequestMapping(value = "/trips", method = RequestMethod.POST)
    public Trip postTrip(@RequestBody Trip trip) {
        return tripRepository.save(trip);
    }

    @RequestMapping(value = "/trips/{trip_id}/join", method = RequestMethod.POST)
    public Trip postTrip(@PathVariable String trip_id, @RequestParam String user_id) {
        return tripRepository.joinOne(trip_id, user_id);
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public LoginData logInUser(@RequestParam String token) {
        return userRepository.getLoginData(token);
    }

    @RequestMapping(value = "/trips/update", method = RequestMethod.POST)
    public Trip updateTrip(@RequestBody Trip trip) {
        return tripRepository.updateOne(trip);
    }

    @RequestMapping(value = "/trips/{id}/delete", method = RequestMethod.POST)
    public String deleteTrip(@PathVariable String id) {
        return tripRepository.deleteOne(id);
    }

    @RequestMapping(value = "/trips/{id}/cancel", method = RequestMethod.POST)
    public Trip cancelTrip(@PathVariable String id) { return tripRepository.cancelJoinOne(id);}
}