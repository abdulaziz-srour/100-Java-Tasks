import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task18Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testMin(int[] array, int expected){
        Task18 task = new Task18();
        assertEquals(expected, task.min(array));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new int[] {7, 2, 1, 9, 7, 1}, 1),
                Arguments.of(new int[] {11, 2, 33, 44, 55, 6, 7}, 2),
                Arguments.of(new int[] {1, 2, 3, -7}, -7)
        );
    }
}