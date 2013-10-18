package com.example.login.core;

public class Session {

    private final String accessToken;

    public Session() {
        this.accessToken = "1";
    }

    public String getAccessToken() {
        return accessToken;
    }
}