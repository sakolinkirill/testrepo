package by.hti.psynet.service;

import by.hti.psynet.dao.Item;
import by.hti.psynet.dao.User;

/**
 * Created by Kirill_Sakolin on 5/15/2015.
 */
public interface AccessService {

    boolean hasAccess(User user, Item item);

}
