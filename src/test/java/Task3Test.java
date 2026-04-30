import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    private Task3 task;
    @BeforeEach
    void setUp() {
        task = new Task3();
    }

    @Test
    void thousandHasThreePerfectNumbers(){
        List<Integer> expected = List.of(6, 28, 496);

        assertIterableEquals(expected, task.calcPerfectNumbers(1000));
    }

    @Test
    void tenThousandHasFourPerfectNumbers(){
        List<Integer> expected = List.of(6, 28, 496, 8128);

        assertIterableEquals(expected, task.calcPerfectNumbers(10000));
    }
}