package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.util.ArrayList;

public class Hunter extends ClassManager implements Class {
    public ArrayList<String> abilities = new ArrayList<>();
    private final Player guardian;

    public Hunter(Player guardian) {
        super(new Hunter(guardian));
        this.guardian = guardian;
    }

    public String getAbilities() {
        this.abilities.add("Gunslinger");
        this.abilities.add("Bladedancer");
        this.abilities.add("Nightstalker");
        return String.join("\n", this.abilities);
    }

    @Override
    public String getGuardianName() {
        return this.guardian.getName();
    }

    public void setHealth() {
        this.guardian.setHealth(this.guardian.getHealth());
    }

    @Override
    public Class getGuardianClass() {
        return new Hunter(this.guardian);
    }
}
