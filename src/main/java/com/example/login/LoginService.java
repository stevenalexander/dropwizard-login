package com.example.login;

import com.example.login.resources.SessionResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class LoginService extends Service<LoginConfiguration> {
    public static void main(String[] args) throws Exception {
        new LoginService().run(args);
    }

    @Override
    public void initialize(Bootstrap<LoginConfiguration> bootstrap) {
        bootstrap.setName("login");
    }

    @Override
    public void run(LoginConfiguration configuration,
                    Environment environment) {
        environment.addResource(new SessionResource());
    }

}