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
        User user = new User("photo", "Karolka", "0");
        Offer offer = new Offer("Spanish","Hi! Learn spanish with me!");

        Route route2 = new Route(departure, "Gdańsk", new ArrayList<Departure>());
        User user2 = new User("photo", "Obywatel Miś", "0");

        TripRepository tripRepository = new TripRepository();
        tripRepository.save(new Trip("0", route, user, offer));
        tripRepository.save(new Trip("0", route2, user2, offer));
        return tripRepository;
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}
