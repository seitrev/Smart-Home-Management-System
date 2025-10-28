package org.example;

public class LightBulb extends Device {
    private int brightnessLevel;
    private String color;

    //full parameterized constructor
    public LightBulb(String deviceName, Status status, String location, int brightnessLevel, String color) {
        super(deviceName, status, location);
        this.brightnessLevel = brightnessLevel;
        this.color = color;
    }

    //constructor with only name and location
    public LightBulb(String deviceName, String location) {
        super(deviceName, Status.OFF, location);
        this.brightnessLevel = 50;
        this.color = "White";
    }

    public void adjustBrightness(int level) {
        if (level >= 0 && level <= 100) {
            brightnessLevel = level;
            System.out.println(deviceName + " brightness set to " + brightnessLevel + "%.");
        } else {
            System.out.println("Invalid brightness level. Must be between 0–100.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brightness Level: " + brightnessLevel + "%");
        System.out.println("Color: " + color);
    }
}
