package net.rainbowcreation.core.api.utils;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

@SuppressWarnings("unused")
public class Action {
    public static void closePlayerInventory(Plugin plugin, Player player) {
        new BukkitRunnable() {
            @Override
            public void run() {
                player.closeInventory();
            }
        }.runTaskLater(plugin, 1L);
    }

    public static void sendPlayerMessage(Player player, String minimessage) {
        player.sendMessage(Chat.minimessageColored(minimessage));
    }

    public static void sendPlayerMessage(Player player, Component component) {
        player.sendMessage(Chat.componentColored(component));
    }

    public static void sendPlayerMessage(Player player, String message, String messageType) {
        player.sendMessage(new Chat(message, messageType).getColored());
    }

    public static void spawnFirework(Location location) {
        // spawn firework
    }
}
