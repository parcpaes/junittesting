package testnulll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringUtilsTestBoth {
    @Test
    void givenNullString_whenReversedIsCalled_thenNullIsReturned(){
        String actual = StringUtils.reverse(null);
        assertNull(actual);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned(){
        String actual = StringUtils.reverse("");
        assertNotNull(actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        assertNotNull(actual);
    }
}
