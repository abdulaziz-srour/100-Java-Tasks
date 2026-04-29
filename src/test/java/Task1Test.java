import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    private Task1 task;

    @BeforeEach
    void declare(){
        task = new Task1();
    }

    // Task a
    @Test
    void sixAndSevenDoZero() {
        assertEquals(0, task.calc(6, 7));
    }

    @Test
    void threeAndFourDoSix(){
        assertEquals(6, task.calc(3, 4));
    }

    @Test
    void fiveAndFiveDoFive(){
        assertEquals(5, task.calc(5, 5));
    }

    // Task b
    @Test
    void threeDoesOneAndTwo(){
        assertArrayEquals(new int[]{1, 2}, task.calcSumAndCountAllNumbersDivBy_2_Or_7(3));
    }

    @Test
    void eightDoesFourAndNineteen(){
        assertArrayEquals(new int[] {4, 19}, task.calcSumAndCountAllNumbersDivBy_2_Or_7(8));
    }

    @Test
    void fifteenDoesEightAndSixtythree(){
        assertArrayEquals(new int[] {9, 77}, task.calcSumAndCountAllNumbersDivBy_2_Or_7(15));
    }

    // Task c
    void fiveIsNotEven(){
        assertEquals(false, task.isEven(5));
    }

    void tenIsEven(){
        assertEquals(true, task.isEven(10));
    }

    void fiveIsOdd(){
        assertEquals(true, task.isOdd(5));
    }

    void tenIsNotOdd(){
        assertEquals(false, task.isOdd(10));
    }
}