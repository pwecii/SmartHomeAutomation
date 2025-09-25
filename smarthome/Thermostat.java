package com.smarthome;

public class Thermostat implements SmartDevice {
    private String name;
    private double temperature = 22.0; // Celsius

    public Thermostat(String name) {
        this.name = name;
    }

    public void increaseTemperature(double delta) {
        temperature += delta;
        System.out.println(name + " thermostat temperature increased to " + temperature + "C");
    }

    public void decreaseTemperature(double delta) {
        temperature -= delta;
        System.out.println(name + " thermostat temperature decreased to " + temperature + "C");
    }

    @Override
    public String getName() {
        return name;
    }
}
