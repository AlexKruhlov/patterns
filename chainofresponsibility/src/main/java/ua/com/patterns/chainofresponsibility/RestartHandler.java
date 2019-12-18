package ua.com.patterns.chainofresponsibility;

public class RestartHandler extends CommonHandler {

    @Override
    public void handle(Request request) {
        if (canHandle(request.getMessage())) {
            System.out.println("Fixed restarting system issue");
            super.setNext(null);
        } else {
            super.handle(request);
        }
    }

    private boolean canHandle(String problem) {
        return problem.equals("Problem with restarting system");
    }
}
