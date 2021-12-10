package DisabledTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledIfSystemPropertyTest {
    @Test
    void testOnAllSystemProperties() {
        assertTrue(3 > 0);
    }

    @DisabledIfSystemProperty(named = "user.name", matches = "dinesh")
    @Test
    void testDisabledIfUserMatchesUserName() {
        assertFalse(0 > 4);
    }

    @DisabledIfSystemProperty(named = "os.name", matches = "Windows .*")
    @Test
    void testDisabledIfOperatingSystemMatchesWindows(){
        assertFalse(10>40);
    }

    @EnabledIfSystemProperty(named = "os.name", matches = "mac os")
    @Test
    void testEnabledIfOperatingSystemMatchesMacOs(){
        assertFalse(1>1000000);
    }
}
