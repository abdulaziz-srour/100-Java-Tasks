import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task24Test {

    @ParameterizedTest
    @CsvSource({"xhixhix, x, 3", "xhixhix, hi, 2", "mic, mic, 1", "haha, ho, 0", "xxxxyz, xx, 2", "xxxxyz, , 0"})
    void testCountSubstrings(String text, String prefix, int expected){
        Task24 task = new Task24();
        assertEquals(expected, task.countSubstrings(text, prefix));
    }
}