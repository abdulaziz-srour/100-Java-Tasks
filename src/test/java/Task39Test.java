import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task39Test {

    @ParameterizedTest
    @CsvSource({
            "1.11.17, 2.3.5, <",
            "2.1, 2.1.3, <",
            "2.3.5, 2.4, <",
            "3.1, 2.4, >",
            "3.3, 3.2.9, >",
            "7.2.71, 7.2.71, ="
    })
    void testCompareVersions(String ver1, String ver2, char expected){
        Task39 task = new Task39();
        assertEquals(expected, task.compareVersions(ver1, ver2));
    }

}