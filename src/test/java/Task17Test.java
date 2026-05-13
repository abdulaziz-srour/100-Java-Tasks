import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @ParameterizedTest
    @MethodSource("getArray")
    void testSum(int[] array, int expected){
        Task17 task = new Task17();
        assertEquals(expected, task.sum(array));
    }

    static Stream<Arguments> getArray(){
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 6),
                Arguments.of(new int[]{1, 2, 3, -7}, -1)
        );
    }
}