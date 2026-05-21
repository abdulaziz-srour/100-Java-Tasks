import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task33Test {

    @ParameterizedTest
    @CsvSource({"ABCD, ABC, true", "ABCDEF, EFAB, true",
            "BCDE, EC, false", "Challenge, GECH, true"})
    void testContainsRotation(String str1, String str2, boolean expected){
        Task33 task = new Task33();
        assertEquals(expected, task.containsRotation(str1, str2));
    }
}