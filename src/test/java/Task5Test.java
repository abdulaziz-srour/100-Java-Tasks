import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    private Task5 task;

    @BeforeEach
    void setUp() {
        task = new Task5();
    }

    @Test
    void calcTwinPairsTest(){
        assertEquals("3=5, 5=7, 11=13, 17=19, 29=31, 41=43", task.calcTwinPrimeNumbers(50));
    }

    @Test
    void calcCousinPairsTest(){
        assertEquals("3=7, 7=11, 13=17, 19=23, 37=41, 43=47", task.calcCousinPrimeNumbers(50));
    }

    @Test
    void calcSexyPairsTest(){
        assertEquals("5=11, 7=13, 11=17, 13=19, 17=23, 23=29, 31=37, 37=43, 41=47, 47=53", task.calcSexyPrimeNumbers(50));
    }
}