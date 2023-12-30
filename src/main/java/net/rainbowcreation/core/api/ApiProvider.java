package net.rainbowcreation.core.api;

import net.rainbowcreation.core.api.utils.*;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import java.util.Map;

public class ApiProvider implements ICore{
    ICore instance;

    @Override
    public Plugin getPlugin() {
        return instance.getPlugin();
    }

    @Override
    public void register(ICore core) {
        instance = core;
    }

    @Override
    public String getVersion() {
        return instance.getVersion();
    }

    @Override
    public Console getConsole() {
        return instance.getConsole();
    }

    @Override
    public Config getConfig(String name) {
        return instance.getConfig(name);
    }

    @Override
    public Bungee getBungee() {
        return instance.getBungee();
    }

    @Override
    public GuiHolder getGuiHolder() {
        return instance.getGuiHolder();
    }

    @Override
    public Map<Player, Boolean> getPlayerLog() {
        return instance.getPlayerLog();
    }

    @Override
    public PluginMessageListener getMessageListener() {
        return instance.getMessageListener();
    }

    @Override
    public FileConfiguration getDefaultConfig() {
        return instance.getDefaultConfig();
    }
}
