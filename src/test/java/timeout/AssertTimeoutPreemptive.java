package timeout;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertTimeoutPreemptive {
    @Test
    void timeoutExceededWithPreemptiveTermination(){
        assertTimeoutPreemptively(Duration.ofMillis(10),()->{
            Thread.sleep(9);
        });
    }
}
