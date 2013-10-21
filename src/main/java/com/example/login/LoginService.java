package com.example.login;

import com.example.login.resources.SessionResource;
import com.example.login.resources.UserResource;

import com.example.login.dao.UserDAO;
import com.example.login.dao.SessionDAO;

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

        final UserDAO userDAO = db.onDemand(UserDAO.class);
        final SessionDAO sessionDAO = db.onDemand(SessionDAO.class);

        environment.addResource(new UserResource(userDAO));
        environment.addResource(new SessionResource(userDAO, sessionDAO));
    }
}
