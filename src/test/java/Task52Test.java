import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task52Test {
    @ParameterizedTest
    @MethodSource("getValues")
    void checkMerge(int[] firstArray, int[] secondArray, int[] expected){
        Task52 task = new Task52();
        assertArrayEquals(expected, task.merge(firstArray, secondArray));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(
                        new int[] {1, 4, 7, 12, 20},
                        new int[] {10, 15, 17, 33},
                        new int[] {1, 4, 7, 10, 12, 15, 17, 20, 33}
                ),
                Arguments.of(
                        new int[] {2, 3, 5, 7},
                        new int[] {11, 13, 17},
                        new int[] {2, 3, 5, 7, 11, 13, 17}
                ),
                Arguments.of(
                        new int[] {2, 3, 5, 7, 11},
                        new int[] {7, 11, 13, 17},
                        new int[] {2, 3, 5, 7, 7, 11, 11, 13, 17}
                ),
                Arguments.of(
                        new int[] {1, 2, 3},
                        new int[] {},
                        new int[] {1, 2, 3}
                )
        );
    }

}