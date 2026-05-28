import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task44Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testIsPalindrome(String[] array, boolean expected){
        Task44 task = new Task44();
        assertEquals(expected, task.isPalindrome(array));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new String[] {"Ein", "Test", "-", "Test", "Ein"}, true),
                Arguments.of(new String[] {"Max", "Mike", "Mike", "Max"}, true),
                Arguments.of(new String[]{"Tim", "Tom", "Mike", "Max"}, false)
        );
    }
}