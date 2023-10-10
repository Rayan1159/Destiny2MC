package org.d2mc;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.d2mc.Classes.Manager.Interface.Class;
import org.d2mc.Commands.ClassStateTest;
import org.d2mc.Config.DMCConfig;
import org.d2mc.Events.Hunter.HunterDoubleJumpEvent;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public final class DestinyMC extends JavaPlugin {

    // Stores the player and their current class to an accessible list across the files
    public static HashMap<Player, Class> playerWithClassMap = new HashMap<>();
    private DMCConfig config;

    @Override
    public void onEnable() {
        //register event
        getServer().getPluginManager().registerEvents(new HunterDoubleJumpEvent(), this);
        //register command
        getCommand("class").setExecutor(new ClassStateTest());
    }

    @Override
    public void onDisable() {//        try {
//            this.config.save();
//        } catch (IOException e) {
//            e.printStackTrace();;
//        }
    }
}
