package dynamictest;

import org.junit.jupiter.api.*;
import predicate.PositiveNumberPredicate;

import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestTest {
    private PositiveNumberPredicate predicate = new PositiveNumberPredicate();

    @BeforeAll
    static void setUptClass(){
        System.out.println("@BeforeAll method");
    }

    @AfterAll
    static void tearDownClass(){
        System.out.println("@AfterAll method");
    }

    @BeforeEach
    void setUp(){
        System.out.println("@BeforeEach method");
    }

    @AfterEach
    void tearDown(){
        System.out.println("@AfterEach method");
    }

    @TestFactory
    Iterator<DynamicTest> positiveNumberPredicateTestCase(){
        return Arrays.asList(
                dynamicTest("negative number",()-> assertFalse(predicate.check(-1))),
                dynamicTest("zero",()-> assertFalse(predicate.check(0))),
                dynamicTest("positive number",()-> assertTrue(predicate.check(1)))
        ).iterator();
    }
}
