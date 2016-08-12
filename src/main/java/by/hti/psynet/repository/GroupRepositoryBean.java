package by.hti.psynet.repository;

import by.hti.psynet.dao.Group;
import by.hti.psynet.dao.User;
import org.bson.types.ObjectId;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Stateless
public class GroupRepositoryBean implements GroupRepository {

    @Inject
    private EntityManager entityManager;


    @Override
    public List<Group> getAll() {
        return entityManager.createNativeQuery("{}", Group.class).getResultList();
    }

    @Override
    public void createGroup(Group group) {
        group.setCreated(new Date());
        entityManager.persist(group);
    }

    @Override
    public boolean isMember(User user, Collection<ObjectId> groupIds) {
        //return entityManager.createNativeQuery("{}", Group.class).getResultList().size() > 0;
        return false;
    }

}
