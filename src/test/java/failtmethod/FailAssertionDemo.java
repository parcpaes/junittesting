package failtmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class FailAssertionDemo {
    @Test
    void testMethodYetNotImplemented(){
        fail();
    }

    //usage 2 test not implemented with fail(String message)
    @Test
    void testMethodNotYetImplemented1(){
        fail("@Test method not yet implemented");
    }

    //usage 3 - test not implemented with fail(Supplier)
    @Test
    void testMethodYetNotImplemented2(){
        fail(()-> "Test method not yet implemented!!");
    }

    //usage 4 - test not implemented with fail (Throwable)
    @Test
    void testMethodYetNotImplemented3(){
        fail(new RuntimeException("@test method not yet implemented!!!"));
    }

    //usage 5 - test not implemented with fail(message,throwable)
    @Test
    void testMethodYetNotImplemented4(){
        fail("Test method not yet implemented!!! ", new RuntimeException("Failed explicitly"));
    }

    //usage 6 - it can be used to verify that an actual exception is thrown.
    @Test
    void testActualExceptionThrown(){
        try{
            methodThatShouldThrowException();
            fail("Exception not thrown!");
        }catch(UnsupportedOperationException e){

        }
    }

    private void methodThatShouldThrowException() {
        throw new UnsupportedOperationException();
    }
}
