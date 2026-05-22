import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task36Test {

    @ParameterizedTest
    @CsvSource({"SOS, . . .   - - -   . . .",
    "TWEET, -   . - -   .   .   -",
    "WEST, . - -   .   . . .   -"})
    void testToMorseCode(String text, String expected){
        Task36 task = new Task36();
        assertEquals(expected, task.toMorseCode(text));
    }
}