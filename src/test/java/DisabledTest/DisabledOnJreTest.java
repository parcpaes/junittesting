package DisabledTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledOnJreTest {
    @Test
    void testOnAllJre() {
        assertTrue(3>0);
    }

    @DisabledOnJre(JRE.JAVA_8)
    @Test
    void testDisabledOnJava8(){
        assertFalse(0>4);
    }

    @DisabledOnJre(JRE.JAVA_9)
    @Test
    void testDisabledOnJava9(){
        assertFalse(10>40);
    }
}
