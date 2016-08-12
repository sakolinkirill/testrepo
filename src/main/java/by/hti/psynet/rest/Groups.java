package by.hti.psynet.rest;

import by.hti.psynet.dao.Group;
import by.hti.psynet.repository.GroupRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by Kirill_Sakolin on 5/12/2015.
 */
@Path("/groups")
//@Stateless
public class Groups {

    @Inject
    private GroupRepository groupRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Collection<Group> getGroups() {
        return groupRepository.getAll();
    }

}
