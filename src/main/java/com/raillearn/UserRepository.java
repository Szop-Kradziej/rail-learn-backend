package com.raillearn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UserRepository {

    private AtomicInteger id = new AtomicInteger(0);
    List<String> users = new ArrayList<String>();

    public LoginData getLoginData(String token) {
        String userId = generateNewUserId().toString();
        LoginData loginData = new LoginData(token, userId);

        users.add(userId);
        return loginData;
    }

    private Integer generateNewUserId() {
        return id.incrementAndGet();
    }
}
