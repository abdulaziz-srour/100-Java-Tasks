import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task49Test {
    @ParameterizedTest
    @MethodSource("getValues")
    void testAddOne(int[] input, int[] expected){
        Task49 task = new Task49();
        assertArrayEquals(expected, task.addOne(input));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new int[] {1, 3, 2, 4}, new int[] {1, 3, 2, 5}),
                Arguments.of(new int[] {1, 4, 8, 9}, new int[] {1, 4, 9, 0}),
                Arguments.of(new int[] {9, 9, 9, 9}, new int[] {1, 0, 0, 0, 0})
        );
    }

}