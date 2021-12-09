package assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumingThatDemo {
    @Test
    void testInAllEnvironment(){
        System.setProperty("ENV","DEV");
        String env = "DEV";
        assumingThat(env.equals(System.getProperty("ENV")),()->{
            System.out.println("Perform these assertions only on the Dev Server!!!");
            assertEquals(2,1+1);
        });
        //perform these assertions in all environments
        assertEquals(42,40+2);
    }

    @Test
    void testInAllEnvironment2(){
        System.setProperty("ENV","DEV");
        String env = "PROD";
        assumingThat(env.equals(System.getProperty("ENV")),()->{
            System.out.println("Perform these assertions only on the Prod server");
            assertEquals(2,1+1);
        });
        assertEquals(42,40+2);
    }
}
