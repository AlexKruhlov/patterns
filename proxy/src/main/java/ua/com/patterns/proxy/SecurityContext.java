package ua.com.patterns.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SecurityContext {
    private final Map<Role, Set<PermAction>> permissions = new HashMap<>();

    public void addPermission(Role role, PermAction permAction) {
        if (!permissions.containsKey(role)) {
            permissions.put(role, new HashSet<>());
        }
        permissions.get(role).add(permAction);
    }

    public Set<PermAction> getPermissionsForRole(Role role) {
        return permissions.get(role);
    }
}
