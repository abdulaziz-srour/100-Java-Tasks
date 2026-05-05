import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {
    private static Task10 task;

    @BeforeAll
    static void setUp() {
        task = new Task10();
    }

    @Test
    void checkOneCoinChange(){
        assertEquals(1, task.calcMaxPossibleChange(new int[]{1}));
    }

    @Test
    void checkTwoCoinsChange(){
        assertEquals(2, task.calcMaxPossibleChange(new int[]{1, 1}));
    }

    @Test
    void checkTwoDifferentCoinsChange(){
        assertEquals(1, task.calcMaxPossibleChange(new int[]{1, 5}));
    }

    @Test
    void checkThreeCoinsChange(){
        assertEquals(7, task.calcMaxPossibleChange(new int[]{1, 2, 4}));
    }

    @Test
    void checkFourCoinsChange(){
        assertEquals(13, task.calcMaxPossibleChange(new int[]{1, 2, 3, 7}));
    }

    @Test
    void checkEightCoinsChange(){
        assertEquals(39, task.calcMaxPossibleChange(new int[]{1, 1, 1, 1, 5, 10, 20, 50}));
    }
}