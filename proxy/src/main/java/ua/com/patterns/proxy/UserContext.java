package ua.com.patterns.proxy;

import static java.lang.Math.random;
import static java.lang.Math.round;
import static ua.com.patterns.proxy.Role.ADMINISTRATOR;
import static ua.com.patterns.proxy.Role.GUEST;

public class UserContext {

    public Role getCurrentRole() {
        return (round((random() * 10)) % 2) == 0 ? ADMINISTRATOR : GUEST;
    }
}
