package org.example;

public class Device {
    protected String deviceName;
    protected Status status; // we used enum for cleaner code
    protected String location;
    protected static int deviceCount = 0;

    public Device() {
        this.deviceName = "Unknown Device";
        this.status = Status.OFF; // enum value
        this.location = "Unknown";
        deviceCount++;
    }

    public Device(String deviceName, Status status, String location) {
        this.deviceName = deviceName;
        this.status = status;
        this.location = location;
        deviceCount++;
    }

    public void turnOn() {
        this.status = Status.ON;
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        this.status = Status.OFF;
        System.out.println(deviceName + " is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Status: " + status);
        System.out.println("Location: " + location);
    }

    public static void showDeviceCount() {
        System.out.println("Total Devices: " + deviceCount);
    }
}

