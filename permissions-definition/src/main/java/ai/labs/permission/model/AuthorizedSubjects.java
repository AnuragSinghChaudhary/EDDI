package ai.labs.permission.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ginccc
 */
public class AuthorizedSubjects {
    private List<AuthorizedUser> users;
    private List<AuthorizedGroup> groups;

    public AuthorizedSubjects() {
        this.users = new ArrayList<AuthorizedUser>();
        this.groups = new ArrayList<AuthorizedGroup>();
    }

    public List<AuthorizedUser> getUsers() {
        return users;
    }

    public void setUsers(List<AuthorizedUser> users) {
        this.users = users;
    }

    public List<AuthorizedGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<AuthorizedGroup> groups) {
        this.groups = groups;
    }
}
