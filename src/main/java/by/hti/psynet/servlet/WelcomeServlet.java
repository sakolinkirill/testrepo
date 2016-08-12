package by.hti.psynet.servlet;

import by.hti.psynet.dao.Group;
import by.hti.psynet.dao.Item;
import by.hti.psynet.repository.GroupRepository;
import by.hti.psynet.repository.ItemRepository;
import by.hti.psynet.repository.RestaurantRepositoryBeanLocal;
import by.hti.psynet.repository.UserRepository;
import by.hti.psynet.dao.User;
import by.hti.psynet.service.AccessService;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@WebServlet("/welcome")
@ServletSecurity(@HttpConstraint(rolesAllowed = { "GG" }))
public class WelcomeServlet extends HttpServlet {

    @Inject
    private RestaurantRepositoryBeanLocal restaurantRepositoryBeanLocal;

    @Inject
    private UserRepository userRepository;

    @Inject
    private ItemRepository itemRepository;

    @Inject
    private GroupRepository groupRepository;

    @Inject
    private AccessService accessService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //List<ObjectId> list = new ArrayList<>();
        User user = userRepository.getAll().get(0);

        /*Item item = new Item();
        item.setTitle("title3");
        item.setDescription("desc3");
        item.setPermission(list);*/

        List<Item> items = itemRepository.getAll();

        /*Group group = new Group();
        group.setName("group name");
        group.setDescription("group description");
        group.setUser(user);
        group.addMember(userRepository.getAll().get(1).getId());
        groupRepository.createGroup(group);*/

        //resp.getWriter().println("groups: " + groupRepository.getAll());
        /*for (Item item : items) {
            boolean access = accessService.hasAccess(user, item);
            resp.getWriter().println("access: " + user.getId() + " " + item.getId() + " " + access);
        }*/
        //resp.getWriter().println(((SimplePrincipal) req.getUserPrincipal()).getName());

        for (Group group : groupRepository.getAll()) {
            resp.getWriter().println(group.getMembers().size());
        }
    }

}
