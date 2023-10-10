package org.d2mc.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.d2mc.Classes.Manager.Interface.IClassManager;
import org.d2mc.DestinyMC;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

//TODO Further implementation of this class
public class GuardianInfo implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player guardian = (Player) sender;
        }
        return true;
    }

    public void openGuardianMenu(Player guardian) {
        Inventory guardianMenu = guardian.getServer().createInventory(null, 9, "Guardian Menu");
        int inventory = guardianMenu.getSize();
    }

    public ArrayList<ItemStack> determineItems(Player player, boolean isClassless, Inventory inventory, int slot) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ItemStack guardianInfo = new ItemStack(Material.OAK_SIGN);
        ItemStack guardianClass = new ItemStack(Material.DIAMOND_SWORD);
        ItemStack guardianAbilities = new ItemStack(Material.BOOK);
        IClassManager targetClass = (IClassManager) DestinyMC.playerWithClassMap.get(player).getClass().getDeclaredConstructor().newInstance();

        if (!targetClass.isClassNull()) {
            //add all items that are required
        } else {
            //limit items added to the inventory3
        }

        return null;
    }
}
