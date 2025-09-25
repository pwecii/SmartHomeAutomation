package com.smarthome;

public class Light implements SmartDevice {
    private String name;
    private int brightness = 100;
    private boolean isOn = false;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " light is ON at brightness " + brightness + "%");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " light is OFF");
    }

    public void setBrightness(int b) {
        brightness = Math.max(0, Math.min(100, b));
        System.out.println(name + " light brightness set to " + brightness + "%");
    }

    @Override
    public String getName() {
        return name;
    }
}
