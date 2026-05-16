import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @ParameterizedTest
    @CsvSource({"7, true", "13, false", "171, true", "47742, false",
            "10201, true", "1221, true", "0, true", "-1111, true", "-10, false"})
    void testIsNumberPalindrome(int num, boolean expected){
        Task22 task = new Task22();
        assertEquals(expected, task.isNumberPalindrome(num));
    }

}