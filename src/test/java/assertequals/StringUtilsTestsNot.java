package assertequals;

import org.junit.jupiter.api.Test;
import testnulll.StringUtils;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringUtilsTestsNot {
    @Test
    void givenEmptyString_whenReverseIsCalled_thenEmptyStringIsReturned(){
        String actual = StringUtils.reverse("");
        String expected = "1234";

        assertNotEquals(expected,actual);
    }

    @Test
    void givenNotNullString_whenReverseIsCalled_thenReversedStringIsReturned(){
        String actual = StringUtils.reverse("ABCD");
        String expected = "DBCA";
        String message = "AssertNotEquals failed";

        assertNotEquals(expected,actual,message);
    }

    @Test
    void givenNotNullString_whenReverseIsCalled_thenReversedStringIsReturned2(){
        String actual = StringUtils.reverse("1234");
        String expected = "4321";
        Supplier<String> messageSupplier = ()-> "AssertNotEquals failed";
        assertNotEquals(expected,actual,messageSupplier);
    }
}
