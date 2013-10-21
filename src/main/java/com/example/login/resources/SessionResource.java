package com.example.login.resources;

import com.example.login.core.User;
import com.example.login.dao.UserDAO;

import com.example.login.core.Session;
import com.example.login.dao.SessionDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/session")
@Produces(MediaType.APPLICATION_JSON)
public class SessionResource {

    private UserDAO userDAO;
    private SessionDAO sessionDAO;

    public SessionResource(UserDAO userDAO, SessionDAO sessionDAO) {
        super();
        this.userDAO = userDAO;
        this.sessionDAO = sessionDAO;
    }

    @POST
    public Session login(
        @FormParam("username") String username,
        @FormParam("password") String password) throws Exception {

        if (userDAO.findUsersByUsernameAndPassword(username, password).isEmpty()) {
            throw new Exception("user not found");
        }

        Session session = new Session(username);
        sessionDAO.insert(session.getAccessToken(), session.getIdentity(), new java.util.Date());

        return session;
    }
}