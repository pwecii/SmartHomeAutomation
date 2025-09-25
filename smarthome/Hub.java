package com.smarthome;

import java.util.HashMap;
import java.util.Map;

public class Hub {
    private Map<String, Command> commandMap = new HashMap<>();

    public void registerCommand(String name, Command cmd) {
        commandMap.put(name, cmd);
    }

    public void executeCommand(String name) {
        Command cmd = commandMap.get(name);
        if (cmd != null) {
            System.out.println("Hub executing: " + name);
            cmd.execute();
        } else {
            System.out.println("No command registered with name: " + name);
        }
    }
}
