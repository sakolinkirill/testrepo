package by.hti.psynet.rest;

import by.hti.psynet.dao.Item;
import by.hti.psynet.repository.ItemRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by Kirill_Sakolin on 5/12/2015.
 */
@Path("/items")
public class Items {

    @Inject
    private ItemRepository itemRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public Collection<Item> getGroups() {
        return itemRepository.getAll();
    }

}
