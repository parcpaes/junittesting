package assertsame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertSameDemo {
    @Test
    void testAssertSameWithSameObject(){
        String actual ="hello";
        String expected = "hello";
        assertSame(expected,actual);
    }

    @Test
    void testAssertSameWithDifferentObject(){
        String actual = "Hello";
        String expected="Hell";

        assertSame(expected,actual);
    }

    @Test
    void testAssertSameWithDifferentObjectAndMessage(){
        String actual = "hello";
        String expected = "hell";

        assertSame(expected,actual,"The actual value is not the same as expected value");
    }

    @Test
    void testAssertSameWithDifferentObjectAndMessageSupplier(){
        String actual = "Hello";
        String expected ="Hell";
        assertSame(expected,actual,()->"The actual value is not same as expected value");
    }
}
