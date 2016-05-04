package com.raillearn;

public class Trip {

    private long id;
    private Route route;
    private User user;
    private Offer offer;

    public Trip(long id, Route route, User user, Offer offer) {
        this.id = id;
        this.route = route;
        this.user = user;
        this.offer = offer;
    }

    public Trip() {
        this.id = 0;
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

    public void setRoute(Route route) {
        this.route = route;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}
