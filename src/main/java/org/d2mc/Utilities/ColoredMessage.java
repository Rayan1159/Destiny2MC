package org.d2mc.Utilities;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public class ColoredMessage {

    private final String message;

    public ColoredMessage(String message) {
        this.message = message;
    }

    public String colorTranslate(String message) {
        return ChatColor.translateAlternateColorCodes('&', this.message);
    }
}
