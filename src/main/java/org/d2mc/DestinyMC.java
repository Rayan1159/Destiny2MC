package org.d2mc;

import co.aikar.commands.BukkitCommandManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.d2mc.Classes.Manager.Interface.Class;
import org.d2mc.Config.DMCConfig;

import java.util.HashMap;

public final class DestinyMC extends JavaPlugin {

    // Stores the player and their current class to an accessible list across the files
    public static HashMap<Player, Class> playerWithClassMap = new HashMap<>();
    private DMCConfig config;

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {//        try {
//            this.config.save();
//        } catch (IOException e) {
//            e.printStackTrace();;
//        }
    }
}
