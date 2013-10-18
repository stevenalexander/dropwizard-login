package com.example.login.resources;

import com.example.login.core.Session;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/session")
@Produces(MediaType.APPLICATION_JSON)
public class SessionResource {

    public SessionResource() {
    }

    @POST
    public Session login(
        @FormParam("username") String username,
        @FormParam("password") String password) {

        return new Session(username);
    }
}