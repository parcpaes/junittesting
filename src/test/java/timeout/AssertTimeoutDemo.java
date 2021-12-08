package timeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AssertTimeoutDemo {
    @Test
    void timeoutNotExceeded(){
        assertTimeout(Duration.ofMinutes(3),()->{
            for(int i=0;i<10000000;i++){
                for(int j=0;j<10000000;j++){
                    int result = i*j;
                }
            }
        });
    }

    @Test
    void timoutNoExceededWithResult(){
        String actualResult = assertTimeout(Duration.ofMillis(3),()->{
            return "result";
        });
        assertEquals("result",actualResult);
    }

    @Test
    void timeoutNotExceededWithMethod(){
        String actualGreeting = assertTimeout(Duration.ofMinutes(3),AssertTimeoutDemo::greeting);
        assertEquals("Hello, World!",actualGreeting);
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(Duration.ofMillis(10),()->{
            Thread.sleep(100);
        });
    }

    private static String greeting() {
        return "Hello, World!";
    }
}
