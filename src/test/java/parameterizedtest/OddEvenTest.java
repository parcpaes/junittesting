package parameterizedtest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import parameterized.OddEven;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenTest {

    @DisplayName("it should return true if the number is even")
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,12,14})
    void itShouldReturnAnEvenNumber(int number){
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isNumberEven(number));
    }
}
