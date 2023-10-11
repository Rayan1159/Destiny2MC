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
//        if (!this.classManager.isClassNull()) {
//            if (this.isRightClass()) {
//                //TODO Implement double jump
//            } else {
//                this.coloredMessage.colorTranslate("&cYou are not a hunter!");
//            }
//        } else {
//            this.coloredMessage.colorTranslate("&cYou do not have a class");
//        }
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
