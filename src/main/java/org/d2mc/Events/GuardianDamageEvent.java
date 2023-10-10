package org.d2mc.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.DestinyMC;

public class GuardianDamageEvent implements Listener {

    @EventHandler
    public void onGuardianDamageEvent(EntityDamageEvent event) {
        Player guardian = (Player) event.getEntity();
        ClassManager manager = new ClassManager(DestinyMC.playerWithClassMap.get(guardian));
    }

}
