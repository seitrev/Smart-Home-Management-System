package org.example;

public class Thermostat extends Device {
    private double temperature;
    private String mode;

    public Thermostat(String deviceName, Status status, String location, double temperature, String mode) {
        super(deviceName, status, location);
        this.temperature = temperature;
        this.mode = mode;
    }

    public Thermostat(String deviceName, String location, double temperature, String mode) {
        super(deviceName, Status.OFF, location);
        this.temperature = temperature;
        this.mode = mode;
    }
    //using method overloading with setTemp
    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    public void setTemperature(double temp, String mode) {
        this.temperature = temp;
        this.mode = mode;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Mode: " + mode);
    }
}

