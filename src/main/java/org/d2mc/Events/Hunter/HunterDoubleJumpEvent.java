package org.d2mc.Events.Hunter;

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
    public boolean canDoubleJump = true;


    public HunterDoubleJumpEvent() {
        this.coloredMessage = new ColoredMessage();
    }

    @EventHandler
    public void onHunterDoubleJumpEvent(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        try {
            this.classManager = new ClassManager(event.getPlayer(), "hunter");
            if (this.isRightClass(this.classManager)) {
                if (player.isSneaking()) {
                    player.setVelocity(player.getLocation().getDirection().multiply(1.5).setY(1));
                    this.canDoubleJump = false;
                }
            }
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
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

}
