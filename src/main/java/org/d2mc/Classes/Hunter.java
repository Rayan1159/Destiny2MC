package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Enums.HunterAbilities;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.util.ArrayList;

public class Hunter implements Class {
    public ArrayList<String> abilities = new ArrayList<>();
    private Player guardian;
    private ClassManager classManager;

    public Hunter(Player guardian)  {
        this.guardian = guardian;
    }

    @Override
    public String getAbilities() {
        for (HunterAbilities abilities : HunterAbilities.values()) {
            this.abilities.add(abilities.toString());
        }
        return String.join("\n", this.abilities);
    }

    @Override
    public void setHealth() {

    }

    @Override
    public String getName() {
        return "uwu";
    }
}
