package parameterizedtest;

import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvSourceTest {

    @ParameterizedTest
    @CsvSource({"one, 1","two, 2","'foo,bar', 3"})
    void testWithCsvSource(String first, int second){
        System.out.println(first+" "+second);
        assertNotNull(first);
        assertNotEquals(0,second);
    }

    @ParameterizedTest
    @CsvSource({
            "apple, 1",
            "banana, 2",
            "'lemon,lime', 0xF1",
            "strawberry, 700_00",
    })
    void testWithCsvSource2(String fruit, int rank){
        assertNotNull(fruit);
        assertNotEquals(0,rank);
    }

//    @ParameterizedTest(name="[{index}] {arguments}")
//    @CsvSource({
//                 "apple,         1",
//                 "banana,        2",
//                 "'lemon, lime', 0xF1",
//                 "strawberry,    700_000"
//            })
    @DisabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_17)
    void testWithCsvSource3(){
        System.out.println();
    }
}
