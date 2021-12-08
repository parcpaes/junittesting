package assertrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {
    @Test
    void testAssertTrueWithTrueCondition(){
        boolean trueValue = true;
        assertTrue(trueValue);
    }

    @Test
    void setAssertTrueWithFalseCondition(){
        boolean falseValue = false;
        assertTrue(falseValue);
    }

    @Test
    void testAssertTrueWithFalseConditionAndMessage(){
        boolean falseValue = false;
        assertTrue(falseValue,"The actual value is false");
    }

    @Test
    void testAssertTrueWithFalseConditionAndMessageSupplier() {
        boolean falseValue = false;
        assertTrue(falseValue,()-> "The actual value is false");
    }

    @Test
    void testAssertTrueWithBooleanSupplier(){
        boolean trueValue = true;
        assertTrue(()-> trueValue);
    }

    @Test
    void testAssertTrueBooleanSupplierAndMessage(){
        boolean falseValue = false;
        assertTrue(()-> falseValue, "The actual value is false");
    }

    @Test
    void testAssertTrueWithBooleanSupplierAndMessageSupplier(){
        boolean falseValue = false;
        assertTrue(()->falseValue,()-> "The actual value is false");
    }
}
