package org.d2mc.Events.Hunter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.d2mc.Classes.Hunter;
import org.d2mc.Classes.Manager.ClassManager;

import java.lang.reflect.InvocationTargetException;

//TODO Further implementation of this class
public class HunterDoubleJumpEvent implements Listener {

    private final ClassManager classManager;
    public boolean canDoubleJump = true;

    public HunterDoubleJumpEvent(Player guardian) {
        this.classManager = new ClassManager(new Hunter(guardian));
    }

    @EventHandler
    public void onHunterDoubleJumpEvent(PlayerMoveEvent event) {
        if (this.isRightClass()) {

        } else {

        }
    }

    public boolean isRightClass() {
        try {
            return this.classManager.getGuardianClass() instanceof Hunter;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return false;
    }

}
