package com.raillearn;

public class Trip {

    public static final String NONE_JOINED_USER = "none_joined_user";
    private String id;
    private Route route;
    private User user;
    private Offer offer;
    private String joinedUser;

    public Trip(String id, Route route, User user, Offer offer, String joinedUser) {
        this.id = id;
        this.route = route;
        this.user = user;
        this.offer = offer;
        this.joinedUser = joinedUser;
    }

    public Trip(String id, Route route, User user, Offer offer) {
        this.id = id;
        this.route = route;
        this.user = user;
        this.offer = offer;
        this.joinedUser = NONE_JOINED_USER;
    }

    public Trip() {
        this.id = "0";
        this.joinedUser = NONE_JOINED_USER;
    }

    public String getId() {
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

    public String getJoinedUser() {
        return joinedUser;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setJoinedUser(String joinedUser) {
        this.joinedUser = joinedUser;
    }
}
