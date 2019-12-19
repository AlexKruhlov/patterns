package ua.com.patterns.proxy;

import static ua.com.patterns.proxy.PermAction.OTHER_ACTION;
import static ua.com.patterns.proxy.PermAction.PRINT_TWICE;
import static ua.com.patterns.proxy.Role.ADMINISTRATOR;
import static ua.com.patterns.proxy.Role.GUEST;

public class App {

    public static void main(String[] args) {
        SecurityContext securityContext = new SecurityContext();
        securityContext.addPermission(ADMINISTRATOR, PRINT_TWICE);
        securityContext.addPermission(ADMINISTRATOR, OTHER_ACTION);
        securityContext.addPermission(GUEST, OTHER_ACTION);
        Service service = new SecurityProxyStringService(securityContext);
        service.printTwice("Hello");
    }
}
