package ua.com.patterns.chainofresponsibility;

public interface Handler {

    void setNext(Handler command);

    void handle(Request request);
}
