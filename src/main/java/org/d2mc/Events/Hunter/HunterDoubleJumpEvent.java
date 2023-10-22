package org.d2mc.Events.Hunter;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.d2mc.Classes.Hunter;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.DestinyMC;
import org.d2mc.Utilities.ColoredMessage;

import java.lang.reflect.InvocationTargetException;

//TODO Further implementation of this class
public class HunterDoubleJumpEvent implements Listener {

    private ClassManager classManager;
    private ColoredMessage coloredMessage;
    public boolean doubleJump = true;


    public HunterDoubleJumpEvent() {
        this.coloredMessage = new ColoredMessage();
    }

    @EventHandler
    public void onHunterDoubleJumpEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        try {
            if (this.getClassManager(player, "hunter").getGuardianClass() instanceof Hunter) {
                Location lastLocation = event.getFrom();
                Location currentLocation = event.getTo();
                if (currentLocation == null) return;

                double deltaX = currentLocation.getX() - lastLocation.getX();
                double deltaY = currentLocation.getY() - lastLocation.getY();
                double deltaZ = currentLocation.getZ() - lastLocation.getZ();

                if (this.canDoubleJump(player, deltaX, deltaY, deltaZ)) {
                    player.setVelocity(player.getLocation().getDirection().multiply(0.5D).setY(1.0D));
                    player.sendMessage("You have double jumped");
                }

            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public boolean isRightClass(ClassManager classManager) {
        try {
            return classManager.getGuardianClass() instanceof Hunter;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

    private ClassManager getClassManager(Player guardian, String className) {
        try {
            return new ClassManager(guardian, className);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean canDoubleJump(Player guardian, double x, double y, double z) {
        this.doubleJump = x > 0.0D && guardian.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR;
        return this.doubleJump;
    }
}
