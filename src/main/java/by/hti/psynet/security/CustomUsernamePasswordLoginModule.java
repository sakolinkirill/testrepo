package by.hti.psynet.security;

import org.jboss.logging.Logger;
import org.jboss.security.SimpleGroup;
import org.jboss.security.SimplePrincipal;
import org.jboss.security.auth.spi.UsernamePasswordLoginModule;

import javax.security.auth.login.LoginException;
import java.security.acl.Group;

/**
 * Created by Kirill_Sakolin on 5/11/2015.
 */
public class CustomUsernamePasswordLoginModule extends UsernamePasswordLoginModule {

    private final Logger LOG = Logger.getLogger(CustomUsernamePasswordLoginModule.class);

    @Override
    protected String getUsersPassword() throws LoginException {
        LOG.infof("MyLoginModule: authenticating user '%s'", getUsername());
        LOG.tracef("MyLoginModule: authenticating user '%s'", getUsername());

        return getUsername();
    }

    @Override
    protected boolean validatePassword(String inputPassword, String expectedPassword) {
        return true;
    }

    @Override
    protected Group[] getRoleSets() throws LoginException {
        SimpleGroup group = new SimpleGroup("Roles");
        try {
            // userGroup picked up by MongoDB Cursor earlier
            group.addMember(new SimplePrincipal("GG"));
        } catch (Exception e) {
            throw new LoginException("Failed to create group member for "
                    + group);
        }
        return new Group[] { group };
    }
}
