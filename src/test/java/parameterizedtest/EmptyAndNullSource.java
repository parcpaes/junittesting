package parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

/*six invocations:
  1 for null,
  1 for the empty string,
   and 4 for the explicit blank strings supplied via @ValueSource*/
public class EmptyAndNullSource {
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {""," ","\t","\n"})
    void nullEmptyAndBlackString(String text){
        assertTrue(text==null || text.trim().isEmpty());
    }
}
