package by.hti.psynet.repository;

import by.hti.psynet.dao.Group;
import by.hti.psynet.dao.User;
import org.bson.types.ObjectId;

import javax.ejb.Local;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Local
public interface GroupRepository {

    List<Group> getAll();

    void createGroup(Group group);

    boolean isMember(User user, Collection<ObjectId> groupIds);

}
