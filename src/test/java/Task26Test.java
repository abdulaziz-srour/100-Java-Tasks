import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task26Test {
    Task26 task;

    @BeforeEach
    void setUp(){
        task = new Task26();
    }

    @ParameterizedTest
    @CsvSource({"10101, true", "13254, false"})
    void testIsBinaryNumber(String binaryNumber, boolean expected){
        assertEquals(expected, task.isBinaryNumber(binaryNumber));
    }


    @ParameterizedTest
    @CsvSource({"111, 7", "11000011, 195", "000, 0", "1000, 8"})
    void testBinaryToDecimal(String binaryNumber, int expected){
        assertEquals(expected, task.binaryToDecimal(binaryNumber));
    }


    @ParameterizedTest
    @CsvSource({"AB, 171", "C3, 195", "0, 0",})
    void testHexToDecimal(String hexadecimalNumber, int expected){
        assertEquals(expected, task.hexToDecimal(hexadecimalNumber));
    }
}