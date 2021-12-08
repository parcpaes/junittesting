package testnulll;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest2 {
    @Test
    void givenNullString_WhenReverseIsCalled_thenNullIsReturned(){
        String actual = StringUtils.reverse(null);
        String message = "Actual String should no be null";

        assertNotNull(actual,message);
    }

    @Test
    void giveNullString_WhenReversedCalled_thenNullReturned(){
        String actual = StringUtils.reverse(null);
        Supplier<String> messageSupplier =()-> "Actual String should not be null!!!";

        assertNotNull(actual,messageSupplier);
    }

    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned(){
        String actual = StringUtils.reverse("");
        assertNotNull(actual);
    }

    @Test
    void giveNonNullString_whenReverseIsCalled_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        assertNotNull(actual);
    }
}