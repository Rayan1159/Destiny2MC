package org.d2mc.Tests;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandManager;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertNull;

@CommandAlias("class|c")
public class ClassStateTestCommand extends BaseCommand {
    private ClassManager manager;

    @Subcommand("spa")
    public void onSpaCommand(CommandSender sender) {
        this.getManager((Player) sender).getAbilities();
    }

    @Subcommand("name")
    public void onNameCommand() {
    }

    @Test
    @DisplayName("Test if this.manager is null")
    public ClassManager getManager(Player sender) {
        try {
            this.manager = new ClassManager(sender, "hunter");
            assertNull(this.manager);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
