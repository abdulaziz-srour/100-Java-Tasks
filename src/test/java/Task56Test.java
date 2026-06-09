import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task56Test {

    @ParameterizedTest
    @CsvSource({
            "1900, false",
            "2000, true",
            "2020, true"
    })
    void checkIsLeap(int year, boolean expected) {
        Task56 task = new Task56();
        assertEquals(expected, task.isLeap(year));
    }
}