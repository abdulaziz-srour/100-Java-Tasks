import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
    Task15 task;

    @BeforeEach
    void setUp() {
        task = new Task15();
    }

    @ParameterizedTest
    @CsvSource({"42, 7, 7", "42, 28, 14", "42, 14, 14"})
    void testGCDRecursive(int a, int b, int expected){
        assertEquals(expected, task.gcdRecursive(a, b));
    }

    @ParameterizedTest
    @CsvSource({"42, 7, 7", "42, 28, 14", "42, 14, 14"})
    void testGCDIterative(int a, int b, int expected){
        assertEquals(expected, task.gcdIterative(a, b));
    }

    @ParameterizedTest
    @CsvSource({"2, 7, 14", "7, 14, 14", "42, 14, 42"})
    void testLCM(int a, int b, int expected){
        assertEquals(expected, task.lcm(a, b));
    }
}