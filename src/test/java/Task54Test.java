import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task54Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void checkArraySplit(int[] array, int addedNumber, int[] expected) {
        Task54 task = new Task54();
        assertArrayEquals(expected, task.arraySplit(array, addedNumber));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new int[] {4, 7, 1, 20}, 9, new int[]{1, 4, 7, 9, 20}),
                Arguments.of(new int[] {3, 5, 2}, 7, new int[]{2, 3, 5, 7}),
                Arguments.of(
                        new int[]{2, 14, 10, 1, 11, 12, 3, 4},
                        7,
                        new int[] {1, 2, 3, 4, 7, 10, 11, 12, 14}
                ),
                Arguments.of(
                        new int[] {3, 5, 7, 1, 11, 13, 17, 19},
                        11,
                        new int[] {1, 3, 5, 7, 11, 11, 13, 17, 19}
                )
        );
    }
}