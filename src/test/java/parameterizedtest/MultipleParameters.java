package parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultipleParameters {
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int num, List<String> list){
        assertEquals(5,str.length());
        assertTrue(num>=1 && num<=2);
        assertEquals(2,list.size());
    }

    static List<Arguments> stringIntAndListProvider(){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments("apple",1, Arrays.asList("a","b")));
        list.add(Arguments.arguments("lemon",1, Arrays.asList("x","y")));
        return list;
    }
}
