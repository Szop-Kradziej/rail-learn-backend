package com.raillearn;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController {

    @RequestMapping("/trips")
    public List<Trip> trips() {
        return Collections.singletonList(new Trip(0, "Warszawa", "Olsztyn"));
    }
}
