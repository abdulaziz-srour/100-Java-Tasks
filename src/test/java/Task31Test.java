import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task31Test {

    @ParameterizedTest
    @CsvSource({"bananas, bans", "lalalamama, lam", "LAlalamama, LAm", "MICHAEL, MICHAEL"})
    void testRemoveDuplicates(String text, String expected){
        Task31 task = new Task31();
        assertEquals(expected, task.removeDuplicates(text));
    }

}