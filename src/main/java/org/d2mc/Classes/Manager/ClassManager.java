package org.d2mc.Classes.Manager;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Hunter;
import org.d2mc.Classes.Manager.Interface.Class;
import org.d2mc.Classes.Manager.Interface.IClassManager;
import org.d2mc.DestinyMC;

import java.lang.reflect.InvocationTargetException;


//The D2MC Class Manager
//This class is used to manage the mechanics, abilities and  of t
public class ClassManager implements IClassManager {
    private Class selectedClass;
    public ClassManager(Player guardian, String classToSelect) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        if (classToSelect.equals("hunter")) {
            this.selectedClass = new Hunter(guardian);
        }
    }

    public String getAbilities() {
        return this.selectedClass.getAbilities();
    }

    public void setHealth() {
        this.selectedClass.setHealth();
    }

    @Override
    public Class getGuardianClass() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return this.selectedClass.getClass().getDeclaredConstructor().newInstance();
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
        return this.selectedClass.getName();
    }

    @Override
    public void setClass(Player guardian, Class playerClass) {
        DestinyMC.playerWithClassMap.put(guardian, playerClass);
    }

}

