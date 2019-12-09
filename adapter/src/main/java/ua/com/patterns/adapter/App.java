package ua.com.patterns.adapter;

public class App {

    public static void main(String[] args) {
        AggregateControl carControl = new AggregateControl(new CarControl(new Car()));
        carControl.move();
        carControl.stop();
        carControl.sendMessage();
        System.out.println("");

        AggregateControl robotControl = new AggregateControl(new RobotControl(new Robot()));
        robotControl.move();
        robotControl.stop();
        robotControl.sendMessage();
        System.out.println("");

        AggregateControl shipControl = new AggregateControl(new ShipControl(new Ship()));
        shipControl.move();
        shipControl.stop();
        shipControl.sendMessage();
    }
}
