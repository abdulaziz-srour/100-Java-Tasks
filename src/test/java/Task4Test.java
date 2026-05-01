import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {
    private Task4 task;
    @BeforeEach
    void setUp() {
        task = new Task4();
    }

    @Test
    void fifteenHasFivePrimes(){
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13);
        assertIterableEquals(expected, task.calcPrimesUpTo(15));
    }

    @Test
    void twentyFiveHasNinePrimes(){
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23);
        assertIterableEquals(expected, task.calcPrimesUpTo(25));
    }

    @Test
    void fiftyHasFifteenPrimes(){
        List<Integer> expected = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        assertIterableEquals(expected, task.calcPrimesUpTo(50));
    }
}