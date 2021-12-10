package DisabledTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledIfEnvironmentVariableTest {
    @Test
    void testOnAllEnvironmentVariables(){
        assertTrue(3>0);
    }

    @EnabledIfEnvironmentVariable(named = "USER",matches="denis")
    @Test
    void testDisabledIfUserMatchesDenis(){
        assertFalse(0>4);
    }

    @DisabledIfEnvironmentVariable(named="HOME",matches="/dummies/home")
    @Test
    void testDisabledIfHomeMatchesDummyDirectory(){
        assertFalse(10>40);
    }
}
