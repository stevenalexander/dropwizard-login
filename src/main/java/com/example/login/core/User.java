package com.example.login.core;

import org.codehaus.jackson.annotate.JsonProperty;

public class User {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    @JsonProperty
    private String displayName;

    @JsonProperty
    private String displayRole;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayRole() {
        return displayRole;
    }

    public void setDisplayRole(String displayRole) {
        this.displayRole = displayRole;
    }
}
