package assertsame;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertSameTest {

    @Test
    void assertSameStrings(){
        String actual = "India";
        String expected="India";
        assertSame(expected,actual);
    }

    @Test
    void testDifferentObjects(){
        String actual = new String("India");
        String expected = new String("India");
        assertSame(expected,actual,"the actual and expected do not refer to same object");
    }

    @Test
    void testSameReference(){
        String actual = new String("India");
        String expected = actual;
        assertSame(expected,actual,()->"the actual value do not refer to same object");
    }

    @Test void testSameList(){
        List<Integer> actualList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
//        assertSame(expectedList,actualList,()->"Actual List is do not refer to same list");
        assertNotSame(expectedList,actualList,()->"Actual list refer to same list");
    }
}
