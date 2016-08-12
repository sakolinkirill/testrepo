package by.hti.psynet.repository;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Kirill_Sakolin on 5/5/2015.
 */
@Stateless
public class EntityManagerProducer {

    @PersistenceContext(unitName = "ExamplePU")
    private EntityManager entityManager;

    @Produces
    public EntityManager entityManager(){
        return entityManager;
    }

}