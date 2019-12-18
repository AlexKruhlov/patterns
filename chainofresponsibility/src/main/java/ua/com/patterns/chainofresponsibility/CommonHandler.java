package ua.com.patterns.chainofresponsibility;

import static java.util.Objects.nonNull;

public class CommonHandler implements Handler {
    private Handler next;

    public CommonHandler() {
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handle(Request request) {
        if (nonNull(next)) {
            next.handle(request);
        } else {
            System.out.println("Handling has already finished");
        }
    }
}
