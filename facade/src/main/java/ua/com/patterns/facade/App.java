package ua.com.patterns.facade;

import static java.lang.Thread.sleep;

public class App {

    public static void main(String[] args) throws InterruptedException {
        PlaneFacade boeing = new BoeingPlane(new Engine(), new AutoPilot(), new CommunicationSystem());
        boeing.takeOff();
        sleep(10000);
        boeing.alert();
        sleep(10000);
        boeing.landing();
    }
}
