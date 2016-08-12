package by.hti.psynet.repository;

import by.hti.psynet.dao.Item;
import org.bson.types.ObjectId;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Local
public interface ItemRepository {

    public List<Item> getAll();

    public List<Item> findByUserAccess(ObjectId objectId);

    public List<Item> findByGroupAccess(ObjectId objectId);

    public void createItem(Item item);

}
