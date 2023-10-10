package org.d2mc.Classes.Manager.Interface;

import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;

public interface IClassManager {
    public String getGuardianName();
    public void setClass(Player guardian, Class playerClass);
    public void setHealth();
    public Class getGuardianClass() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException;
    public boolean isClassNull();
}
