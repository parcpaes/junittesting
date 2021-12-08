package assertequals;

import org.junit.jupiter.api.Test;
import testnulll.StringUtils;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest1 {
    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned(){
        String actual = StringUtils.reverse("");
        String expected = "";

        assertEquals(expected,actual);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        String expected = "DBCA";
        String message = "AssertEquals failed";

        assertEquals(expected,actual,message);
    }

    @Test
    void givenNonNullString_whenReverseIsCalled_thenReversedStringIsReturned2(){
        String actual = StringUtils.reverse("1234");
        String expected = "4321";

        Supplier<String> messageSupplier = ()-> "AssertEquals failed";
        assertEquals(expected,actual,messageSupplier);
    }
}
