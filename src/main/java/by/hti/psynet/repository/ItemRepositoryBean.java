package by.hti.psynet.repository;

import by.hti.psynet.dao.Item;
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
public class ItemRepositoryBean implements ItemRepository {

    @Inject
    private EntityManager entityManager;


    @Override
    public List<Item> getAll() {
        return entityManager.createNativeQuery("{}", Item.class).getResultList();
    }

    @Override
    public List<Item> findByUserAccess(ObjectId objectId) {
        String query = String.format("{userAccess : {'$oid': \"%s\"}}", objectId.toString());
        return entityManager.createNativeQuery(query, Item.class).getResultList();
    }

    @Override
    public List<Item> findByGroupAccess(ObjectId objectId) {
        String query = String.format("{userAccess : {'$oid': \"%s\"}}", objectId.toString());
        return entityManager.createNativeQuery(query, Item.class).getResultList();
    }

    @Override
    public void createItem(Item item) {
        item.setCreated(new Date());
        entityManager.persist(item);
    }
}
