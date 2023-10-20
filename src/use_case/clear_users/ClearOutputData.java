package use_case.clear_users;

// TODO Complete me

import java.util.Set;

public class ClearOutputData {
    private final Set<String> users;
    public ClearOutputData(Set<String> users) {

        this.users = users;
    }
    public Set<String> getUsers() { return users; }
}
