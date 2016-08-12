package by.hti.psynet.repository;

import by.hti.psynet.dao.Restaurants;
import by.hti.psynet.dao.Section;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Kirill_Sakolin on 5/1/2015.
 */
@Local
public interface RestaurantRepositoryBeanLocal {

    public List<Restaurants> getAll();

    public void createItem();

    List<Section> getAllSections();
}
