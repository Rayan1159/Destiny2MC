package org.d2mc.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.d2mc.Classes.Hunter;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Warlock;

public class SetClass implements CommandExecutor {

    private ClassManager classManager;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args[0].equals("hunter")) {
                classManager.setClass(player, new Hunter(player));
            }
        }
        return true;
    }
}
