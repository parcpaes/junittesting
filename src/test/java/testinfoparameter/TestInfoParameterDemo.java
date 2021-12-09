package testinfoparameter;

import org.junit.jupiter.api.*;

@DisplayName("Testing Dependency Injection")
public class TestInfoParameterDemo {

    @BeforeAll
    static void beforeAll(TestInfo testInfo){
        System.out.println("BeforeAll got executed with test info as ");
        System.out.println("Display name -" + testInfo.getDisplayName());
        System.out.println("Test Class - " + testInfo.getTestClass());
        System.out.println("Test Method " + testInfo.getTestMethod());
        System.out.println("************************");
    }

    public TestInfoParameterDemo(TestInfo testInfo){
        System.out.println("Constructor got executed with test info as");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test class - "+testInfo.getTestClass());
        System.out.println("Test Method - "+testInfo.getTestMethod());
        System.out.println("******************");
    }

    @BeforeEach
    public void beforeEach(TestInfo testInfo){
        System.out.println("BeforeEach() got executed with test info as - ");
        System.out.println("Display name- " + testInfo.getDisplayName());
        System.out.println("Test class - "+testInfo.getTestClass());
        System.out.println("Test Method - "+testInfo.getTestMethod());
        System.out.println("********************");
    }

    @Test
    @DisplayName("Test method by name testOne")
    void testOne(TestInfo testInfo){
        System.out.println("TestOne() got executed with test info as");
        System.out.println("Display name - " + testInfo.getDisplayName());
        System.out.println("Test Class -"+ testInfo.getTestClass());
        System.out.println("Test Method -"+ testInfo.getTestMethod());
        System.out.println("*************");
    }
}
