import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task29Test {

    @ParameterizedTest
    @CsvSource({"Otto, true", "ABCBX, false", "ABCXcba, true"})
    void testIsPalindrome(String text, boolean expected){
        Task29 task = new Task29();
        assertEquals(expected, task.isPalindrome(text));
    }

    @ParameterizedTest
    @CsvSource({"'Sit on a potato pan, Otis', true", "Taco cat._,true"})
    void testIsPalindromeWithIgnoredCharacters(String text, boolean expected){
        Task29 task = new Task29();
        assertEquals(expected, task.isPalindromeWithIgnoredCharacters(text));
    }
}