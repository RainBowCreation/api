package net.rainbowcreation.api;

import net.rainbowcreation.api.compatibles.lobbyspawn;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Main
{
    private static Main instance;
    private final lobbyspawn lobbyspawnAPI = new lobbyspawn();
    private static Logger logger;
    private Map<String, Object> centralMap;

    public static Main getInstance() {
        if (instance == null) {
            instance = new Main();
        }
        return instance;
    }

    public Object getValue(String key) {
        return centralMap.get(key);
    }

    public void setValue(String key, Object value) {
        centralMap.put(key, value);
    }

    public lobbyspawn get() {
        return lobbyspawnAPI;
    }

    public static Logger setLogger(Logger logger) {
        Main.logger = logger;
        return Main.logger;
    }
    public static Logger getLogger() {
        return logger;
    }
    private Main() {
        centralMap = new HashMap<>();
    }
}
