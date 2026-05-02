import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    Task7 task;

    @BeforeEach
    void setUp() {
        task = new Task7();
    }

    @Test
    void firstRomanNumberTest(){
        assertEquals(10, task.fromRomanNumber("X"));
    }

    @Test
    void secondRomanNumberTest(){
        assertEquals(17, task.fromRomanNumber("XVII"));
    }

    @Test
    void thirdRomanNumberTest(){
        assertEquals(444, task.fromRomanNumber("CDXLIV"));
    }

    @Test
    void fourthRomanNumberTest(){
        assertEquals(1971, task.fromRomanNumber("MCMLXXI"));
    }

    @Test
    void fifthRomanNumberTest(){
        assertEquals(2020, task.fromRomanNumber("MMXX"));
    }
}