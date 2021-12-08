package testnulll;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void givenNullString_whenReverseIsCalled_thenNullIsReturned(){
        String actual = StringUtils.reverse(null);
        assertNull(actual);
    }

    @Test
    void givenEmptyString_WhenReverseIsCalled_thenEmptyStringIsReturned(){
        String actual = StringUtils.reverse("");
        String message = "Actual string should be null";
        assertNull(actual,message);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        Supplier<String> messageSupplier = ()->"Actual String should be null!!!";
        assertNull(actual,messageSupplier);
    }
}