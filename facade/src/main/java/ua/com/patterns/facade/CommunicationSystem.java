package ua.com.patterns.facade;

public class CommunicationSystem {

    public void sendMessage(String message) {
        System.out.println("Sending message: " + message + "...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("The message has been sent successfully");
    }

    public void readMessage(String message) {
        System.out.println("Message: " + message);
    }
}
