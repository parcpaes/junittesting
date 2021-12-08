package beforeandafter;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    public LifecycleTest(){
        System.out.println("lifecycleTest - constructor got executed!!!");
    }
    @Test
    void testOne(){
        System.out.println("LifecycleTest - testOne() got executed!!!");
    }

    @Test
    void testTwo(){
        System.out.println("LifecycleTest - testTwo() gto executed!!!");
    }
}
