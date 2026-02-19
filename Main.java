public class Main {

    public static void main(String[] args) {

        RescueRobot robot = new RescueRobot("RR-01");

        robot.updatePosition(13.7563, 100.5018);

        robot.takeOff();
        System.out.println(robot.status());
        robot.land();

        robot.startEngine();
        System.out.println("Max Speed: " + robot.maxSpeed());
        robot.stopEngine();

        double temp = robot.readTemperatureC();
        System.out.println("Temperature: " + temp);

        boolean human = robot.detectHuman(36.5);
        System.out.println("Human Detected: " + human);

        robot.send("Found hotspot...");

        robot.showBattery();
    }
}