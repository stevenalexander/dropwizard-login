package com.example.login;

import com.example.login.resources.SessionResource;
import com.example.login.resources.UserResource;
import com.example.login.dao.UserDAO;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.Database;
import com.yammer.dropwizard.db.DatabaseFactory;

public class LoginService extends Service<LoginConfiguration> {

    public static void main(String[] args) throws Exception
    {
        new LoginService().run(args);
    }

    private LoginService()
    {
        super("login");
    }

    @Override
    protected void initialize(LoginConfiguration configuration, Environment environment) throws Exception {

        final DatabaseFactory factory = new DatabaseFactory(environment);
        final Database db = factory.build(configuration.getDatabase(), "mysql");

        final UserDAO dao = db.onDemand(UserDAO.class);

        environment.addResource(new UserResource(dao));
        environment.addResource(new SessionResource());
    }
}
