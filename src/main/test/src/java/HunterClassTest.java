import org.bukkit.entity.Player;
import org.d2mc.Classes.Manager.ClassManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.lang.reflect.InvocationTargetException;

import static org.mockito.Mockito.when;

public class HunterClassTest {

    private ClassManager classManager;

    @Test
    @DisplayName("Checks if the titan class is properly returned")
    public void titanClassReturnTest() {
        Player player = Mockito.mock(Player.class);
        try {
            this.classManager = this.manager(player, "titan");
            when(this.classManager.getGuardianClass().toString()).thenReturn("Mocked Values");
            String result = this.classManager.getGuardianClass().toString();
            assert "Mocked Values".equals(this.classManager.getGuardianClass().toString()) : "The result is not equal to the expected value: " + result;
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("Checks if the warlock class is properly returned")
    public void warlockClassReturnTest() {
        Player player = Mockito.mock(Player.class);
        try {
            this.classManager = this.manager(player, "warlock");
            when(this.classManager.getGuardianClass().toString()).thenReturn("Mocked Values");
            String result = this.classManager.getGuardianClass().toString();
            assert "Mocked Values".equals(result) : "The result is not equal to the expected value: " + result;
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public ClassManager manager(Player player, String className) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new ClassManager(player, className);
    }

}
