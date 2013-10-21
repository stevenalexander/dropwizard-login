package com.example.login.resources;

import com.example.login.core.User;
import com.example.login.dao.UserDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/")
@Produces({MediaType.APPLICATION_JSON})
public class UserResource {

    private UserDAO userDAO;

    public UserResource(UserDAO userDAO) {
        super();
        this.userDAO = userDAO;
    }

    @GET
    @Path("user")
    public List<User> fetch(){

        return userDAO.findAll();
    }
}
