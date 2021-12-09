package assumptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class AssumeTrueDemo {
    @Test
    void testOneDevelopmentEnvironment(){
        System.setProperty("ENV","DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")));
    }

    @Test
    void testOnProductionEnvironment(){
        System.setProperty("ENV","PROD");
        assumeTrue("DEV".equals(System.getProperty("ENV")),"Assumption failed");
    }
}

