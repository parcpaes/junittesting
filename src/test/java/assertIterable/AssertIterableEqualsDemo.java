package assertIterable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class AssertIterableEqualsDemo {
    @Test
    void testAssertIterableEqualsForEqualIterables(){
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> actual = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertIterableEquals(expected,actual);
    }

    @Test
    void testAssertIterableEqualsForNotEqualIterables(){
        Map<Integer,String> expectedMap = Map.of(1,"A",2,"B");
        Map<Integer,String> actualMap = Map.of(1,"A",2,"C");
        assertEquals(expectedMap,actualMap);
    }
}
