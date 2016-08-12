package by.hti.psynet.repository;

import by.hti.psynet.dao.Restaurants;
import by.hti.psynet.dao.Section;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Stateless
public class RestaurantRepositoryBean implements RestaurantRepositoryBeanLocal {

    @Inject
    private EntityManager entityManager;

    /*@Inject
    private EntityManagerFactory entityManagerFactory;*/

    @Override
    public List<Restaurants> getAll() {
        //EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExamplePU");
        //EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createNativeQuery("{}", Restaurants.class).getResultList();
    }

    @Override
    public void createItem() {

        Section section = new Section("a1", "a2");
        Restaurants restaurants = new Restaurants("sakolin");
        restaurants.setSession(section);
        entityManager.persist(restaurants);
        //throw new RuntimeException("nikopol");
        //entityManager.persist(restaurants);
    }

    @Override
    public List<Section> getAllSections() {
        return entityManager.createNativeQuery("{}", Section.class).getResultList();
    }
}
