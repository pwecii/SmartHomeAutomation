package com.smarthome;

public class TurnOnCommand implements Command {
    private SmartDevice device;
    private String param;

    public TurnOnCommand(SmartDevice device) {
        this.device = device;
    }

    // optional param for things like playlist name or brightness
    public TurnOnCommand(SmartDevice device, String param) {
        this.device = device;
        this.param = param;
    }

    @Override
    public void execute() {
        if (device instanceof Light) {
            Light l = (Light) device;
            if (param != null) {
                try {
                    int b = Integer.parseInt(param);
                    l.setBrightness(b);
                } catch (NumberFormatException e) {
                    // ignore
                }
            }
            l.turnOn();
        } else if (device instanceof MusicPlayer) {
            MusicPlayer m = (MusicPlayer) device;
            String playlist = param == null ? "Default Playlist" : param;
            m.playPlaylist(playlist);
        } else {
            System.out.println("TurnOnCommand: Unknown device " + device.getName());
        }
    }
}
