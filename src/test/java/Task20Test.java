import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task20Test {
    private Task20 task;

    @BeforeEach
    void setUp(){
        task = new Task20();
    }

    @ParameterizedTest
    @CsvSource({"2, true", "10, false", "16, true"})
    void testIsPowerOf2(int num, boolean expected){
        assertEquals(expected, task.isPowerOf2(num));
    }

    @ParameterizedTest
    @CsvSource({"2, 2, 4", "2, 8, 256", "4, 4, 256", "5, 0, 1", "-2, 3, -8"})
    void testPowerOfRecursive(int a, int b, long expected){
        assertEquals(expected, task.powerOfRecursive(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 2, 4", "2, 8, 256", "4, 4, 256", "5, 0, 1", "-2, 3, -8"})
    void testPowerOfIterative(int a, int b, long expected){
        assertEquals(expected, task.powerOfIterative(a, b));
    }

}