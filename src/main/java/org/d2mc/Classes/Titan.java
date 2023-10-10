package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.util.ArrayList;

public class Titan extends ClassManager implements Class {

    private ArrayList<String> abilities = new ArrayList<>();
    private final Player guardian;

    public Titan(Player guardian) {
        super(new Titan(guardian));
        this.guardian = guardian;
    }

    public String getAbilities() {
        ArrayList<String> abilities = new ArrayList<>();
        abilities.add("Striker");
        abilities.add("Defender");
        abilities.add("Sunbreaker");
        return String.join("\n", abilities);
    }

    @Override
    public void setHealth() {
        this.guardian.setHealth(this.guardian.getHealth());
    }

    public String getName() {
        return null;
    }
}
