package org.d2mc.Classes.Manager;

import org.bukkit.entity.Player;
import org.checkerframework.checker.units.qual.C;
import org.d2mc.Classes.Manager.Interface.Class;
import org.d2mc.Classes.Manager.Interface.IClassManager;
import org.d2mc.DestinyMC;

import java.lang.reflect.InvocationTargetException;


//The D2MC Class Manager
//This class is used to manage the mechanics, abilities and  of t
public class ClassManager implements IClassManager {
    private final Class playerClass;

    public ClassManager(Class playerClass) {
        this.playerClass = playerClass;
    }

    public String getAbilities() {
        return this.playerClass.getAbilities();
    }

    public String getGuardianName(Player guardian) {
        return guardian.getName();
    }

    public void setHealth() {
        this.playerClass.setHealth();
    }

    @Override
    public Class getGuardianClass() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return this.playerClass.getClass().getDeclaredConstructor().newInstance();
    }

    @Override
    public boolean isClassNull() {
        try {
            return this.getGuardianClass() == null;
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException| InvocationTargetException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public String getGuardianName() {
        if (this.playerClass.getName() == null) {
            return "null";
        } else {
            return "not null";
        }
    }

    @Override
    public void setClass(Player guardian, Class playerClass) {
        DestinyMC.playerWithClassMap.put(guardian, playerClass);
    }

}

