package by.hti.psynet.service;

import by.hti.psynet.dao.Item;
import by.hti.psynet.dao.User;
import by.hti.psynet.repository.GroupRepository;
import org.jboss.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Kirill_Sakolin on 5/15/2015.
 */
@Stateless
public class AccessServiceBean implements AccessService {

    private final Logger LOG = Logger.getLogger(AccessServiceBean.class);

    @Inject
    private GroupRepository groupRepository;

    @Override
    public boolean hasAccess(User user, Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item can't be null");
        }
        if (user == null) {
            throw new IllegalArgumentException("User can't be null");
        }
        LOG.info("user access found: " + item.getUserAccess().size());
        /*if (item.getUserAccess().contains(user.getId())) {
            return true;
        }*/
        return groupRepository.isMember(user, item.getGroupAccess());
    }
}
