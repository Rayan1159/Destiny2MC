package org.d2mc.Classes;

import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.d2mc.Classes.Manager.Interface.Class;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Hunter implements Class {
    public ArrayList<String> abilities = new ArrayList<>();
    private Player guardian;
    private ClassManager classManager;

    public Hunter(Player guardian) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.guardian = guardian;
    }


    @Override
    public String getAbilities() {
        return null;
    }

    @Override
    public void setHealth() {

    }

    @Override
    public String getName() {
        return "uwu";
    }
}
