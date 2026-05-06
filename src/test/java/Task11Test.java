import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {
    private static Task11 task;
    private static Map<Integer, Integer> numbers;

    @BeforeAll
    static void setUp() {
        task = new Task11();
        numbers = task.calcAmicableNumbers(1210);
    }

    @Test
    void checkAmicableNumbersLength(){
        assertEquals(4, numbers.size());
    }

    @Test
    void checkFirstAmicableNumber(){
        assertEquals(220, numbers.get(284));
    }
}