package beforeandafter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAndAfter {
    public BeforeAndAfter(){
        System.out.println("Lifecycle - constructor got executed");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Lifecycle - beforeEach got executed!");
    }

    @Test
    void testOne(){
        System.out.println("Lifecycle - testOne() got executed");
    }

    @Test
    void testTwo(){
        System.out.println("LifecycleTest -testTwo() go executed");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Lifecycle -  afterEach() got executed!!");
    }
}
