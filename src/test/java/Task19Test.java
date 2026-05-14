import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task19Test {

    @ParameterizedTest
    @CsvSource({"5, 101", "7, 111", "22, 10110", "42, 101010", "256, 100000000"})
    void testToBinary(int num, String expected){
        Task19 task = new Task19();
        assertEquals(expected, task.toBinary(num));
    }

    @ParameterizedTest
    @CsvSource({"7, 7", "8, 10", "42, 52"})
    void testToOctal(int num, String expected){
        Task19 task = new Task19();
        assertEquals(expected, task.toOctal(num));
    }

    @ParameterizedTest
    @CsvSource({"15, F", "77, 4D"})
    void testToHex(int num, String expected){
        Task19 task = new Task19();
        assertEquals(expected, task.toHex(num));
    }

}