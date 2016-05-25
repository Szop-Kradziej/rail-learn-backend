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

        TripRepository tripRepository = new TripRepository();
        addTestData(tripRepository);
        return tripRepository;
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    private void addTestData(TripRepository tripRepository) {
        Departure departure = new Departure("Warszawa", "04.06.2016", "17:50");
        Route route = new Route(departure, "Olsztyn", new ArrayList<Departure>());
        User user = new User("photo", "Karol", "0");
        Offer offer = new Offer("Hiszpański","Cześć! Ucz się ze mną hiszpańskiego - poziom A2.");

        Departure departure2 = new Departure("Kraków", "02.06.2016", "12:50");
        Route route2 = new Route(departure2, "Gdańsk", new ArrayList<Departure>());
        User user2 = new User("photo", "Obywatel Miś", "0");
        Offer offer2 = new Offer("Matematyka","Korepetycje z analizy matematycznej 1-2 rok studiów");

        Departure departure3 = new Departure("Bydgoszcz", "30.05.2016", "10:15");
        Route route3 = new Route(departure3, "Warszawa", new ArrayList<Departure>());
        User user3 = new User("photo", "Asia J.", "0");
        Offer offer3 = new Offer("Francuski","Konwersacje po francusku poziom B2");

        Departure departure4 = new Departure("Warszawa", "08.06.2016", "18:15");
        Route route4 = new Route(departure4, "Wrocław", new ArrayList<Departure>());
        Offer offer4 = new Offer("Angielski","Pomogę w przygotowaniu do egzaminu FCE");

        Departure departure5 = new Departure("Wrocław", "10.06.2016", "15:25");
        Route route5 = new Route(departure5, "Warszawa", new ArrayList<Departure>());

        tripRepository.save(new Trip("0", route, user, offer));
        tripRepository.save(new Trip("0", route2, user2, offer2));
        tripRepository.save(new Trip("0", route3, user3, offer3));
        tripRepository.save(new Trip("0", route4, user3, offer4));
        tripRepository.save(new Trip("0", route5, user3, offer4));
    }
}
