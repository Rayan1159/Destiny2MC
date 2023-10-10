package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Hunter extends ClassManager implements Class {
    public ArrayList<String> abilities = new ArrayList<>();
    private Player guardian;

    public Hunter(Player guardian) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        super(Hunter.class.getDeclaredConstructor().newInstance());
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
    public String getName() {
        return null;
    }

    @Override
    public Class getGuardianClass() {
        try {
            return new Hunter(this.guardian);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
