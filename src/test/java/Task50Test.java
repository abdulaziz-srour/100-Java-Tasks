import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task50Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testIsSudokuValid(int[][] input, boolean expected){
        Task50 task = new Task50();
        assertEquals(expected, task.isSudokuValid(input));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new int[][]{
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3},
                        new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6},
                        new int[]{2, 1, 4, 3, 6, 5, 8, 9, 7},
                        new int[]{3, 6, 5, 8, 9, 7, 2, 1, 4},
                        new int[]{8, 9, 7, 2, 1, 4, 3, 6, 5},
                        new int[]{5, 3, 1, 6, 4, 2, 9, 7, 8},
                        new int[]{6, 4, 2, 9, 7, 8, 5, 3, 1},
                        new int[]{9, 7, 8, 5, 3, 1, 6, 4, 2}
                }, true),
                Arguments.of(new int[][]{
                        new int[]{1, 2, 0, 4, 5, 0, 7, 8, 9},
                        new int[]{0, 5, 6, 7, 0, 9, 0, 2, 3},
                        new int[]{7, 8, 0, 1, 2, 3, 4, 5, 6},
                        new int[]{2, 1, 4, 0, 6, 0, 8, 0, 7},
                        new int[]{3, 6, 0, 8, 0, 7, 2, 1, 4},
                        new int[]{0, 9, 7, 0, 1, 4, 3, 6, 0},
                        new int[]{5, 3, 1, 6, 0, 2, 9, 0, 8},
                        new int[]{6, 0, 2, 9, 7, 8, 5, 3, 1},
                        new int[]{9, 7, 0, 0, 3, 1, 6, 4, 2}
                }, true),
                Arguments.of(new int[][]{
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3},
                        new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6},
                        new int[]{2, 1, 4, 3, 6, 5, 8, 9, 7},
                        new int[]{3, 6, 5, 8, 9, 7, 2, 1, 4},
                        new int[]{5, 9, 7, 2, 1, 4, 3, 6, 5},
                        new int[]{5, 3, 1, 6, 4, 2, 9, 7, 8},
                        new int[]{6, 4, 2, 9, 7, 8, 5, 3, 1},
                        new int[]{9, 7, 8, 5, 3, 1, 6, 4, 2}
                }, false),
                Arguments.of(new int[][]{
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                        new int[]{4, 5, 6, 7, 8, 9, 1, 2, 3},
                        new int[]{7, 8, 9, 1, 2, 3, 4, 5, 6},
                        new int[]{2, 1, 4, 3, 6, 5, 8, 9, 7},
                        new int[]{3, 6, 5, 9, 9, 7, 2, 1, 4},
                        new int[]{8, 9, 7, 2, 1, 4, 3, 6, 5},
                        new int[]{5, 3, 1, 6, 4, 2, 9, 7, 8},
                        new int[]{6, 4, 2, 9, 7, 8, 5, 3, 1},
                        new int[]{9, 7, 8, 5, 3, 1, 6, 4, 2}
                }, false)
        );
    }
}