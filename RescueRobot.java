public class RescueRobot implements Flyable, Drivable, ThermalSensor, Communicable {

    private String deviceId;
    private Battery battery;
    private GPSTracker gps;
    private ThermalCamera thermal;

    public RescueRobot(String deviceId) {
        this.deviceId = deviceId;
        this.battery = new Battery(100);
        this.gps = new GPSTracker();
        this.thermal = new ThermalCamera();
    }

    public void updatePosition(double lat, double lon) {
        gps.updatePosition(lat, lon);
    }

    @Override
    public void takeOff() {
        battery.drain(10);
        System.out.println("Taking off...");
    }

    @Override
    public void land() {
        battery.drain(5);
        System.out.println("Landing...");
    }

    @Override
    public double maxAltitude() {
        battery.drain(2);
        return 500.0;
    }

    @Override
    public void startEngine() {
        battery.drain(5);
        System.out.println("Engine started.");
    }

    @Override
    public void stopEngine() {
        battery.drain(3);
        System.out.println("Engine stopped.");
    }

    @Override
    public double maxSpeed() {
        battery.drain(2);
        return 120.0;
    }

    @Override
    public double readTemperatureC() {
        battery.drain(3);
        return thermal.readTemperatureC();
    }

    @Override
    public boolean detectHuman(double thresholdC) {
        battery.drain(3);
        return thermal.detectHuman(thresholdC);
    }

    @Override
    public void send(String message) {
        battery.drain(2);
        System.out.println(
                "ID=" + deviceId +
                ", POS=" + gps.currentPosition() +
                ", MSG=" + message
        );
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public String status() {
        return "ROBOT: " + Flyable.super.status()
                + " + "
                + Drivable.super.status();
    }

    public void showBattery() {
        System.out.println("Battery: " + battery.getPercentage() + "%");
    }
}