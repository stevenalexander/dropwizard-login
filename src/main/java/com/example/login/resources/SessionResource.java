package com.example.login.resources;

import com.example.login.core.Session;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/session")
@Produces(MediaType.APPLICATION_JSON)
public class SessionResource {

    public SessionResource() {
    }

    @GET
    public Session login() {
        return new Session();
    }
}