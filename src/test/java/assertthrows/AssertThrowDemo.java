package assertthrows;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowDemo {

    @Test
    void testAssertThrows(){
        assertThrows(ArithmeticException.class,()-> divide(1,0));
    }

    @Test void testAssertThrowsWithMessage(){
        assertThrows(IOException.class, () -> divide(1, 0), "Division by zero!!");
    }

    @Test
    void testAssertThrowsWithMessageSupplier(){
       assertThrows(ArithmeticException.class,()-> divide(1,0),()->"Division by zero !!!");
    }

    private int divide(int a, int b) {
        return a/b;
    }
}
