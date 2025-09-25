package com.smarthome;

public class MusicPlayer implements SmartDevice {
    private String name;
    private int volume = 50;
    private boolean playing = false;

    public MusicPlayer(String name) {
        this.name = name;
    }

    public void playPlaylist(String playlist) {
        playing = true;
        System.out.println(name + " music player playing playlist: " + playlist + " at volume " + volume);
    }

    public void stop() {
        playing = false;
        System.out.println(name + " music player stopped");
    }

    public void increaseVolume(int delta) {
        volume = Math.min(100, volume + delta);
        System.out.println(name + " music player volume increased to " + volume);
    }

    public void decreaseVolume(int delta) {
        volume = Math.max(0, volume - delta);
        System.out.println(name + " music player volume decreased to " + volume);
    }

    @Override
    public String getName() {
        return name;
    }
}
