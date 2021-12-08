package displayname;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Display name with emojis \uD83D\uDE31")
public class DisplayNameEmojis {

    @Test
    @DisplayName("should demonstrate a simple assertion ")
    void test(){
        System.out.println("Test method got executed");
    }

    @Test
    @DisplayName("Should check all items in the list")
    void shouldCheckAllItemsInTheList(){
        List<Integer> numbers = List.of(2,3,5,7);
        assertAll(
                () -> assertEquals(2, numbers.get(0)),
                () -> assertEquals(3, numbers.get(1)),
                () -> assertEquals(5, numbers.get(2)),
                () -> assertEquals(7, numbers.get(3))
        );
    }
}
