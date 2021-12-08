package assertrue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AssertFalseDemo {
    @Test
    void testAssertFalseWithFalseCondition(){
        boolean falseValue = false;
        assertFalse(falseValue);
    }

    @Test void testAssertFalseWithTrueCondition(){
        boolean trueValue = true;
        assertFalse(trueValue);
    }

    @Test
    void testAssertFalseWithTrueConditionAndMessage(){
        boolean trueValue = true;
        assertFalse(trueValue,"The actual value is true");
    }

    @Test
    void testAssertFalseWithTrueConditionAndMessageSupplier(){
        boolean trueValue = true;
        assertFalse(trueValue,()-> "The actual value is true");
    }

    @Test
    void testAssertFalseWithBooleanSupplier(){
        boolean falseValue = false;
        assertFalse(()-> falseValue);
    }

    @Test
    void testAssertFalseWithBooleanSupplierAndMessage(){
        boolean trueValue = true;
        assertFalse(()-> trueValue, "The actual value is true");
    }

    @Test
    void testAssertFalseWithBooleanSupplierAndMessageSupplier(){
        boolean trueValue = true;
        assertFalse(()-> trueValue,()->"The actual value is true");
    }
}
