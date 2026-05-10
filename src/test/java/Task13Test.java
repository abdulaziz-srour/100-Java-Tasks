import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task13Test {
    private Task13 task;

    @BeforeEach
    void setUp(){
        task = new Task13();
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void testFibonacciRecNumbers(int n, long expected){
        assertEquals(expected, task.fibRec(n));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void testFibonacciIterNumbers(int n, long expected){
        assertEquals(expected, task.fibIter(n));
    }
}