import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @ParameterizedTest
    @CsvSource({"A, A", "ABC, CBA", "abcdefghi, ihgfedcba"})
    void testReverseString(String text, String expected){
        Task16 task = new Task16();
        assertEquals(expected, task.reverseString(text));
    }
}