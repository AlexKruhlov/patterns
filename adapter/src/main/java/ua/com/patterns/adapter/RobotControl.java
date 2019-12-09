package ua.com.patterns.adapter;

public class RobotControl implements Control {
    private final Robot robot;

    public RobotControl(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void move() {
        robot.makeSteps();
    }

    @Override
    public void sendMessage() {
        robot.speak();
    }

    @Override
    public void stop() {
        robot.stay();
    }
}
