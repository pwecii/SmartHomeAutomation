package com.smarthome;

public class TurnOffCommand implements Command {
    private SmartDevice device;

    public TurnOffCommand(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        if (device instanceof Light) {
            ((Light) device).turnOff();
        } else if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).stop();
        } else {
            System.out.println("TurnOffCommand: Unknown device " + device.getName());
        }
    }
}
