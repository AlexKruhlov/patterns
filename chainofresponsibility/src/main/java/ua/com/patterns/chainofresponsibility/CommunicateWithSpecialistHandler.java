package ua.com.patterns.chainofresponsibility;

public class CommunicateWithSpecialistHandler extends CommonHandler {

    @Override
    public void handle(Request request) {
        if (canHandle(request.getMessage())) {
            System.out.println("Specialist communicating has been took place");
            super.setNext(null);
        } else {
            super.handle(request);
        }
        super.handle(request);
    }

    private boolean canHandle(String issue) {
        return issue.equals("Communicate with specialist");
    }
}
