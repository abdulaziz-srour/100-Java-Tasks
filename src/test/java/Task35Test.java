import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task35Test {

    @ParameterizedTest
    @CsvSource({"Otto, Toto, true", "Mary, Army, true", "Ananas, Bananas, false"})
    void testIsAnagram(String str1, String str2, boolean expected){
        Task35 task = new Task35();
        assertEquals(expected, task.isAnagram(str1, str2));
    }

}