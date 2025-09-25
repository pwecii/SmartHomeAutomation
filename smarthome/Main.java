package com.smarthome;

public class Main {
    public static void main(String[] args) {
        Hub hub = new Hub();

        // Create devices
        Light living = new Light("LivingRoom");
        Thermostat t1 = new Thermostat("Hallway");
        MusicPlayer mp = new MusicPlayer("BedroomPlayer");

        // Register commands - hub doesn't need to know device internals
        hub.registerCommand("lights:on", new TurnOnCommand(living, "80")); // set brightness 80 then turn on
        hub.registerCommand("lights:off", new TurnOffCommand(living));
        hub.registerCommand("thermostat:up", new IncreaseTempCommand(t1, 2.0));
        hub.registerCommand("music:party", new TurnOnCommand(mp, "Party Mix")); // play playlist
        hub.registerCommand("music:stop", new TurnOffCommand(mp));
        hub.registerCommand("music:down", new DecreaseVolumeCommand(mp, 10));

        // Execute some commands
        hub.executeCommand("lights:on");
        hub.executeCommand("thermostat:up");
        hub.executeCommand("music:party");
        hub.executeCommand("music:down");
        hub.executeCommand("music:stop");
        hub.executeCommand("lights:off");

        // Adding a new device is done outside the Hub: hub only needs a Command object.
        // Example: register a new command for a new device (no Hub change required).
    }
}
