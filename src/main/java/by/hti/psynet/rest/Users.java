package by.hti.psynet.rest;

import by.hti.psynet.repository.UserRepository;
import by.hti.psynet.dao.User;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by Kirill_Sakolin on 5/12/2015.
 */
@Path("/users")
//@Stateless
public class Users {

    @Inject
    private UserRepository userRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @RolesAllowed("GG")
    @Path("/all")
    public Collection<User> getUsers() {
        return userRepository.getAll();
    }

}
