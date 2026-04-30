import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private Task2 task;
    @BeforeEach
    void setUp() {
        task = new Task2();
    }

    @Test
    void sevenAsText(){
        assertEquals("SEVEN", task.numberAsText(7));
    }

    @Test
    void fourTwoAsText(){
        assertEquals("FOUR TWO", task.numberAsText(42));
    }

    @Test
    void twoFourSixEightZeroAsText(){
        assertEquals("TWO FOUR SIX EIGHT ZERO", task.numberAsText(24680));
    }

    @Test
    void oneThreeFiveSevenNineAsText(){
        assertEquals("ONE THREE FIVE SEVEN NINE", task.numberAsText(13579));
    }
}