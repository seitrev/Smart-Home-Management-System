package org.example;

public class SmartHomeController {
    private Device[] devices;

    public SmartHomeController(Device[] devices) {
        this.devices = devices;
    }

    public void turnAllOn() {
        System.out.println("\nTurning all devices ON...");
        for (Device device: devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("\nTurning all devices OFF...");
        for (Device device : devices) {
            device.turnOff();
        }
    }
}