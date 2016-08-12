package by.hti.psynet.repository;

import by.hti.psynet.dao.User;
import org.bson.types.ObjectId;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Stateless
public class UserRepositoryBean implements UserRepository {

    @Inject
    private EntityManager entityManager;


    @Override
    public List<User> getAll() {
        return entityManager.createNativeQuery("{}", User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        user.setCreated(new Date());
        entityManager.persist(user);
    }

    @Override
    public User find(ObjectId objectId) {
        return entityManager.find(User.class, objectId);
    }
}
