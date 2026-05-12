import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {
    private Task14 task;

    @BeforeEach
    void setUp(){
        task = new Task14();
    }

    @ParameterizedTest
    @CsvSource({"1234, 4", "1234567, 7"})
    void testCalcDigits(int n, int expected){
        assertEquals(expected, task.calcDigits(n));
    }

    @ParameterizedTest
    @CsvSource({"1234, 10", "1234567, 28"})
    void testCalcSumOfDigits(int n, int expected){
        assertEquals(expected, task.calcSumOfDigits(n));
    }
}