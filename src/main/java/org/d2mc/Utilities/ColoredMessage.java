package org.d2mc.Utilities;

import org.bukkit.ChatColor;
import org.bukkit.Color;

public class ColoredMessage {

    public String colorTranslate(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
