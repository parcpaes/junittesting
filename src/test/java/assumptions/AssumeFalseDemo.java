package assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;

public class AssumeFalseDemo {
    @Test
    void testOneDevelopmentEnvironment(){
        System.setProperty("ENV","DEV");
        String env = "DEV";
        assumeFalse(env.equals(System.getProperty("ENV")),"Assumption failed");
    }

    @Test
    void testOnProductionEnvironment(){
        System.setProperty("ENV","PROD");
        String env = "DEV";
        assumeFalse(env.equals(System.getProperty("ENV")));
    }
}
