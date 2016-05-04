package com.raillearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public TripRepository tripRepository() {
        Departure departure = new Departure("Warszawa", "04.04.2016", "17:50");
        Route route = new Route(departure, "Olsztyn", new ArrayList<Departure>());
        User user = new User("photo", "Karolka");
        Offer offer = new Offer("Spanish","Hi! Learn spanish with me!");

        TripRepository tripRepository = new TripRepository();
        tripRepository.save(new Trip(0, route, user, offer));
        return tripRepository;
    }
}
