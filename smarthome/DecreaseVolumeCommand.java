package com.smarthome;

public class DecreaseVolumeCommand implements Command {
    private SmartDevice device;
    private int delta;

    public DecreaseVolumeCommand(SmartDevice device, int delta) {
        this.device = device;
        this.delta = delta;
    }

    @Override
    public void execute() {
        if (device instanceof MusicPlayer) {
            ((MusicPlayer) device).decreaseVolume(delta);
        } else {
            System.out.println("DecreaseVolumeCommand: Device " + device.getName() + " cannot change volume");
        }
    }
}
