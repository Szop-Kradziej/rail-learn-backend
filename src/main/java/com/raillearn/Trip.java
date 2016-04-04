package com.raillearn;

public class Trip {

    private final long id;
    private final Route route;
    private final User user;
    private final Offer offer;

    public Trip(long id, Route route, User user, Offer offer) {
        this.id = id;
        this.route = route;
        this.user = user;
        this.offer = offer;
    }

    public long getId() {
        return id;
    }

    public Route getRoute() {
        return route;
    }

    public User getUser() {
        return user;
    }

    public Offer getOffer() {
        return offer;
    }
}
