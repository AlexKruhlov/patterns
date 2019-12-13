package ua.com.patterns.facade;

public interface PlaneFacade {

    void takeOff();

    void landing();

    void autoPilotOn();

    void autoPilotOff();

    void regulateEngine(int point);

    void messageTo(String message);

    void messageFrom(String message);

    void alert();
}
