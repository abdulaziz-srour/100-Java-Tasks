import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task30Test {

    @ParameterizedTest
    @CsvSource({"Otto, false", "Adrian, false", "Micha, true", "ABCDEFG, true"})
    void testCheckNoDuplicateChars(String text, boolean expected){
        Task30 task = new Task30();
        assertEquals(expected, task.checkNoDuplicateChars(text));
    }
}