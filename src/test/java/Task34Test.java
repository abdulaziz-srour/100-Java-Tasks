import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task34Test {

    @ParameterizedTest
    @CsvSource({"(()), true", "()(), true", "(()))((()), false", "(((), false"})
    void testCheckBraces(String text, boolean expected){
        Task34 task = new Task34();
        assertEquals(expected, task.checkBraces(text));
    }

}