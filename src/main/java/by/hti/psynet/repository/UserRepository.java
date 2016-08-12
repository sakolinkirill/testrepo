package by.hti.psynet.repository;

import by.hti.psynet.dao.User;
import org.bson.types.ObjectId;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Local
public interface UserRepository {

    public List<User> getAll();

    public void createUser(User user);

    public User find(ObjectId objectId);

}
