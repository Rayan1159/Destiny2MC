package org.d2mc.Tests;

import org.d2mc.Classes.Manager.ClassManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertNull;

public class ManagerTest {

    @Test
    @DisplayName("Test Manager")
    public void testManager() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Class<ClassManager> classManager = ClassManager.class;
        Mockito.verify(classManager.getDeclaredConstructor().newInstance()).isClassNull();
    }
}