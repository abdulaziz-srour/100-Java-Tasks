import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    Task6 task;

    @BeforeEach
    void setUp() {
        task = new Task6();
    }

    @Test
    void firstChecksumTest(){
        assertEquals(5, task.calcChecksum("11111"));
    }

    @Test
    void secondChecksumTest(){
        assertEquals(0, task.calcChecksum("87654321"));
    }
}