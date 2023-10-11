package org.d2mc.Tests;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;

import java.lang.reflect.InvocationTargetException;

public class ClassStateTestCommand implements CommandExecutor {

    private ClassManager manager;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player guardian = (Player) sender;
            try {
                this.manager = new ClassManager(guardian, "hunter");
                guardian.sendMessage(this.manager.getAbilities());
            } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
