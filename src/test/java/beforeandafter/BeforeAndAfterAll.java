package beforeandafter;

import org.junit.jupiter.api.*;

public class BeforeAndAfterAll {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Lifecycle - beforeAll() got executed");
    }

    public BeforeAndAfterAll(){
        System.out.println("Lifecycle  Constructor got executed! ");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Lifecycle - beforeEach() got executed");
    }

    @Test
    void testOne(){
        System.out.println("Lifecycle - testOne got executed");
    }

    @Test
    void testTwo() {
        System.out.println("Lifecycle - testTwo() got executed");
    }

    @AfterEach
    void afterEach(){
        System.out.println("lifecycle - afterEach got executed");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Lifecycle - afterAll() got executed()");
    }


}
