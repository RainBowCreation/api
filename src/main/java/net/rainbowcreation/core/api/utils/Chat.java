package net.rainbowcreation.core.api.utils;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class Chat {
    Component component;
    String legacy;

    public Chat() {
        // none
    }

    public Chat(Component component) {
        this.component = component;
        legacy = componentLegacy(component);
    }

    public Chat(String string, String type) {
        if (string.isEmpty())
            return;
        switch (type.toLowerCase()) {
            case ("minimessage") : {
                component = minimessageComponent(string);
                break;
            }
            case ("plain") : {
                component = plainComponent(string);
                break;
            }
            case ("legacy") : {
                component = legacyComponent(string);
                break;
            }
        }
        legacy = componentLegacy(component);
    }

    public Chat(String minimessage) {
        component = minimessageComponent(minimessage);
        legacy = componentLegacy(component);
    }

    public Component getComponent() {
        return component;
    }

    public String getLegacy() {
        return legacy;
    }

    public String getColored() {
        return legacyColored(legacy);
    }

    public String getMinimessage() {
        return componentMinimessage(component);
    }

    public String getPlain() {
        return componentPlain(component);
    }

    // deserializer

    public static Component minimessageComponent(String minimessage) {
        return MiniMessage.miniMessage().deserialize(minimessage);
    }

    public static Component legacyComponent(String legacy) {
        return LegacyComponentSerializer.legacyAmpersand().deserialize(legacy);
    }

    public static Component plainComponent(String plain) {
        return PlainTextComponentSerializer.plainText().deserialize(plain);
    }

    // serializer

    public static String componentPlain(Component component) {
        return PlainTextComponentSerializer.plainText().serialize(component);
    }

    public static @NotNull String componentMinimessage(Component component) {
        return MiniMessage.miniMessage().serialize(component);
    }

    public static String componentLegacy(Component component) {
        return LegacyComponentSerializer.legacySection().serialize(component);
    }

    // colored

    public static String legacyColored(String legacy) {
        return ChatColor.translateAlternateColorCodes('&', legacy);
    }

    // chat color

    public static net.md_5.bungee.api.ChatColor getColor(String color) {
        return net.md_5.bungee.api.ChatColor.of(color);
    }

    // converter

    public static String minimessageLegacy(String minimessage) {
        return new Chat(minimessage).getLegacy();
    }
    public static String minimessagePlain(String minimessage) {
        return new Chat(minimessage).getPlain();
    }

    public static String legacyMinimessage(String legacy) {
        return new Chat(legacy, "legacy").getMinimessage();
    }
    public static String legacyPlain(String legacy) {
        return new Chat(legacy, "legacy").getPlain();
    }

    public static String plainLegacy(String plain) {
        return new Chat(plain, "plain").getLegacy();
    }
    public static String plainMinimessage(String plain) {
        return new Chat(plain, "plain").getMinimessage();
    }

    public static String componentColored(Component component) {
        return new Chat(component).getColored();
    }

    public static String minimessageColored(String minimessage) {
        return new Chat(minimessage).getColored();
    }
}
