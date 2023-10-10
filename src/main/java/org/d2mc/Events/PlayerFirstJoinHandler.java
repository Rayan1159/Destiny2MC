package org.d2mc.Events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.d2mc.Utilities.ColoredMessage;

public class PlayerFirstJoinHandler implements Listener {

    @EventHandler
    public void onPlayerFirstJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!event.getPlayer().hasPlayedBefore()) {

        }
        ColoredMessage message = new ColoredMessage("&cYou're playing on an 0.2-ALPHA Desinty 2 gamemode minecraft server");
        player.sendMessage(message.toString());
    }

    public void openClassSelectionMenu() {
        Inventory inventory = Bukkit.createInventory(null, 9, "Select your class");
        ItemStack titan = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack hunter = new ItemStack(Material.BOW);
        ItemStack warlock = new ItemStack(Material.BOOK);
    }
}
