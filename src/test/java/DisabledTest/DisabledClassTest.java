package DisabledTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledClassTest {
    @Test
    void testMethod1(){
        assertTrue(4>0);
    }

    @Disabled("Skip in upper environment")
    @Test
    void testMethod2(){
        System.setProperty("ENV","PROD");
        String env = "PROD";
        assertTrue(env.equals(System.getProperty("ENV")));
    }
}
