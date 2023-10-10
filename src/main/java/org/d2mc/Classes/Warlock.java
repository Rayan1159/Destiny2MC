package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.util.ArrayList;


public class Warlock extends ClassManager implements Class {

    public ArrayList<String> abilities = new ArrayList<>();
    private final Player guardian;
    public Warlock(Player guardian) {
        super(new Warlock(guardian));
        this.guardian = guardian;
    }

    public String getAbilities() {
        this.abilities.add("Voidwalker");
        this.abilities.add("Sunsinger");
        this.abilities.add("Stormcaller");
        return String.join("\n", abilities);
    }

    @Override
    public void setHealth() {
        this.guardian.setHealth(this.guardian.getHealth());
    }
}
