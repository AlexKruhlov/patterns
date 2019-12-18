package ua.com.patterns.chainofresponsibility;

public class SettingsHandler extends CommonHandler {

    @Override
    public void handle(Request request) {
        if (canHandle(request.getMessage())) {
            System.out.println("Setting issue has been resolved");
            super.setNext(null);
        } else {
            super.handle(request);
        }
    }

    private boolean canHandle(String issue) {
        return issue.equals("Settings issue");
    }
}
