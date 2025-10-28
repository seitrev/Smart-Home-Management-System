package org.example;
/*MEMBERS:
    1. FERRER, JOHN EDWARD
    2. JANOHAN, RUSSEL
    3. CENAON, ORVILLE NIÑO
 */
public class SmartHomeMain {
    public static void main(String[] args) {
        System.out.println("==== Starting SmartHomeMain ====");
        LightBulb b1 = new LightBulb("Kitchen Bulb", Status.OFF, "Kitchen", 75, "White-Gray");
        Thermostat t1 = new Thermostat("Office Thermostat", Status.OFF, "Office", 18.5, "Cooling");
        Thermostat t2 = new Thermostat("Bedroom Thermostat", Status.OFF, "Bedroom", 20.0, "Heating");

        Device[] devices = { b1, t1, t2 };
        //using SmartHomeController method
        SmartHomeController controller = new SmartHomeController(devices);
        controller.turnAllOn();

        //displaying devices
        for (Device d : devices) {
            System.out.println("---------------------------");
            d.displayInfo();
        }

        Device.showDeviceCount();
        System.out.println("\n==== SmartHomeMain Finished ====");
    }
}

