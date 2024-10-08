package net.rainbowcreation.core.api.utils;

import net.rainbowcreation.core.api.ApiProvider;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;


@SuppressWarnings("unused")
public class Console {
    private Plugin plugin;

    public Console(Plugin plugin) {
        this.plugin = plugin;
    }

    public void err(String string) {
        info(string, "red");
    }

    public void info(String string) {
        info(string, "light_purple");
    }

    public void info(String string, String color) {
        final StackTraceElement[] stack_trace_elements = Thread.currentThread().getStackTrace();
        final String calling_class = stack_trace_elements[2].getClassName();
        final String class_name = calling_class.substring(calling_class.lastIndexOf(".") + 1);
        final String calling_method = stack_trace_elements[2].getMethodName();
        final String log = "(" + class_name + ") " + "[" + calling_method + "] " + string;
        try {
            if (ApiProvider.instance.getVersion().startsWith("v1_2")) {
                Bukkit.getConsoleSender().sendMessage(Chat.getColor(color) + log);
            }
            else {
                Bukkit.getConsoleSender().sendMessage(log);
            }
        } catch (Exception ignored) {
            plugin.getLogger().info("(" + class_name + ") " + "[" + calling_method + "] " + string);
        }
    }
}
