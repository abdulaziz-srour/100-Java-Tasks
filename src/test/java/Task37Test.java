import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task37Test {

    @ParameterizedTest
    @CsvSource({"tim mike mike tim, xyyx, true",
    "tim mike tom tim, xyyx, false",
    "time mike mike tim, xyxx, false",
    "tim tim tim tim, xxxx, true"})
    void testMatchesPattern(String text, String pattern, boolean expected){
        Task37 task = new Task37();
        assertEquals(expected, task.matchesPattern(text,pattern));
    }
}