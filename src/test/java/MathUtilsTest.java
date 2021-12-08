import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("MathUtils")
class MathUtilsTest {
    MathUtils mathUtils;
    TestInfo testInfo;
    TestReporter testReporter;

    @BeforeAll
    static void beforeAllInit(){
        System.out.println("this needs to run Before All");
    }

    @BeforeEach
    void init(TestInfo testInfo, TestReporter testReporter){
        this.testInfo = testInfo;
        this.testReporter = testReporter;
        mathUtils = new MathUtils();
        testReporter.publishEntry("Running "+testInfo.getDisplayName()+" with tags "+testInfo.getTags());
    }

    @AfterEach
    void cleanUp(){
        System.out.println("Cleaning up...");
    }

    @Test
    @DisplayName("Testing add method")
    void testAdd(){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"the add method should add two numbers");
    }

    @Test
//    @EnabledOnOs(OS.LINUX)
    void testDivide() {
        boolean isServerUp = true;
        assumeTrue(isServerUp);
        assertThrows(ArithmeticException.class,()-> mathUtils.divide(1,0),"divided by zero should throw");
    }

//    @RepeatedTest(3)
    @Test
    @Tag("Circle")
    void testComputeCircleRadius() {
//        repetitionInfo.getCurrentRepetition();
        assertEquals(314.1592653589793,mathUtils.computeCircleArea(10)
                ,"should return right circle area");
    }

    @Test
    @DisplayName("TDD method.. should not run")
    @Disabled
    void testDisabled() {
        fail("this test should be disabled");
    }

    @Nested
    @DisplayName("Add Methods")
    @Tag("Math")
    class AddTest{
        @Test
        @DisplayName("When adding two positive numbers")
        void testAddPositive() {
            assertEquals(2,mathUtils.add(1,1),"should return the right sum");
        }

        @Test
        @DisplayName("When adding two negative numbers")
        void testAddNegative() {
            int expected=-2;
            int actual = mathUtils.add(-1,-1);
            assertEquals(expected,actual,()->"should return sum+ "+expected+" but returned "+actual);
        }
    }

    @Test
    @Tag("Math")
    @DisplayName("multiply method")
    void testMultiply(){
//        assertEquals(4,mathUtils.multiply(2,2),"should return the right product");
        assertAll(()-> assertEquals(4,mathUtils.multiply(2,2)),
                ()-> assertEquals(0,mathUtils.multiply(2,0)),
                ()-> assertEquals(-2,mathUtils.multiply(2,-1)),
                ()-> assertEquals(-2,mathUtils.multiply(2,-1)),
                ()-> assertEquals(-2,mathUtils.multiply(2,-1)),
                ()-> assertEquals(-2,mathUtils.multiply(2,-1)),
                ()-> assertEquals(-2,mathUtils.multiply(2,-1))
                );
    }
}