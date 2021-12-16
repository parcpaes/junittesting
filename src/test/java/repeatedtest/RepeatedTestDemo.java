package repeatedtest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedTestDemo {
    @RepeatedTest(value=5, name=RepeatedTest.SHORT_DISPLAY_NAME)
    void simpleRepeatedTest(){
        assertTrue(0<5);
    }

    @RepeatedTest(5)
    void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo){
        System.out.println(repetitionInfo.getCurrentRepetition());
        assertEquals(5, repetitionInfo.getTotalRepetitions());
    }

    @RepeatedTest(name="{displayName} - {currentRepetition}/{totalRepetitions}",value=5)
    @DisplayName("Repeated test")
    void repeatedTestWithDisplayName(){
        assertTrue(0<5);
    }

    @RepeatedTest(10)
    public void isMultipleOfThree(RepetitionInfo repetitionInfo){
        int index = repetitionInfo.getCurrentRepetition();
        assertTrue((index*3)%3==0);
    }
}
