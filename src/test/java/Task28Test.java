import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @ParameterizedTest
    @CsvSource({"ABCD, DCBA", "OTTO, OTTO", "PETER, RETEP"})
    void testReverse(String text, String expected){
        Task28 task = new Task28();
        assertEquals(expected, task.reverse(text));
    }
}