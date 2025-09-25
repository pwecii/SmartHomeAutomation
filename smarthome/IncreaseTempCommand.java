package com.smarthome;

public class IncreaseTempCommand implements Command {
    private SmartDevice device;
    private double delta;

    public IncreaseTempCommand(SmartDevice device, double delta) {
        this.device = device;
        this.delta = delta;
    }

    @Override
    public void execute() {
        if (device instanceof Thermostat) {
            ((Thermostat) device).increaseTemperature(delta);
        } else {
            System.out.println("IncreaseTempCommand: Device " + device.getName() + " cannot change temperature");
        }
    }
}
