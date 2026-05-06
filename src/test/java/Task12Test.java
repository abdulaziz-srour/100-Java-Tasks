import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task12Test {
    private Task12 task;

    @BeforeEach
    void setUp() {
        task = new Task12();
    }

    @Test
    void firstPrimeFactor(){
        List<Integer> expected = List.of(2, 2, 2);
        assertIterableEquals(expected, task.calcPrimeFactors(8));
    }

    @Test
    void secondPrimeFactor(){
        List<Integer> expected = List.of(2, 7);
        assertIterableEquals(expected, task.calcPrimeFactors(14));
    }

    @Test
    void thirdPrimeFactor(){
        List<Integer> expected = List.of(2, 3, 7);
        assertIterableEquals(expected, task.calcPrimeFactors(42));
    }

    @Test
    void fourthPrimeFactor(){
        List<Integer> expected = List.of(3, 5, 7, 11);
        assertIterableEquals(expected, task.calcPrimeFactors(1155));
    }

    @Test
    void fifthPrimeFactor(){
        List<Integer> expected = List.of(2, 11, 101);
        assertIterableEquals(expected, task.calcPrimeFactors(2222));
    }
}