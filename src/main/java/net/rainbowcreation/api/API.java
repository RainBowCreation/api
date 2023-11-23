package net.rainbowcreation.api;

import net.rainbowcreation.api.compatibles.lobbyspawn;
import net.rainbowcreation.api.config.GeneralConfig;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class API
{
    private static API instance;
    private final lobbyspawn lobbyspawnAPI = new lobbyspawn();
    private static Logger logger;
    private Map<String, Object> centralMap;
    private GeneralConfig.Settings settings;
    private GeneralConfig.Bypass bypass;
    private GeneralConfig.Loginer loginer;

    public static API getInstance() {
        if (instance == null) {
            instance = new API();
        }
        return instance;
    }

    public Object getValue(String key) {
        return centralMap.get(key);
    }

    public void setValue(String key, Object value) {
        centralMap.put(key, value);
    }

    public GeneralConfig.Settings setting() {
        if (settings == null) {
            settings = new GeneralConfig.Settings();
        }
        return settings;
    }

    public GeneralConfig.Bypass bypass() {
        if (bypass == null) {
            bypass = new GeneralConfig.Bypass();
        }
        return bypass;
    }

    public GeneralConfig.Loginer loginer() {
        if (loginer == null) {
            loginer = new GeneralConfig.Loginer();
        }
        return loginer;
    }

    public lobbyspawn get() {
        return lobbyspawnAPI;
    }

    public Logger setLogger(Logger logger) {
        API.logger = logger;
        return API.logger;
    }
    public Logger getLogger() {
        return logger;
    }
    private API() {
        centralMap = new HashMap<>();
    }
}
