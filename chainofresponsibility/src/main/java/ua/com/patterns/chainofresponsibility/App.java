package ua.com.patterns.chainofresponsibility;

public class App {

    public static void main(String[] args) {
        Handler restartHandler = new RestartHandler();
        Handler settingsHandler = new SettingsHandler();
        Handler communicationHandler = new CommunicateWithSpecialistHandler();
        restartHandler.setNext(settingsHandler);
        settingsHandler.setNext(communicationHandler);

        Request request = new Request("Communicate with specialist");
        restartHandler.handle(request);
    }
}
