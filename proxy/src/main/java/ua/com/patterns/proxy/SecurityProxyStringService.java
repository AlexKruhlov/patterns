package ua.com.patterns.proxy;

import static ua.com.patterns.proxy.PermAction.PRINT_TWICE;

public class SecurityProxyStringService implements Service {
    private final Service service = new StringService();
    private final SecurityContext securityContext;
    private final UserContext userContext = new UserContext();

    public SecurityProxyStringService(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    @Override
    public void printTwice(String string) {
        if (checkPermission()) {
            service.printTwice(string);
        } else {
            System.out.println("User with role " + userContext.getCurrentRole()
                    + " doesn't have the permission for action: " + PRINT_TWICE);
        }
    }

    private boolean checkPermission() {
        return securityContext
                .getPermissionsForRole(userContext.getCurrentRole())
                .contains(PRINT_TWICE);
    }
}
