import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task53Test {
    private Task53 task;

    @BeforeEach
    void setUp(){
        task = new Task53();
    }

    @ParameterizedTest
    @MethodSource("getFindMinValues")
    void checkFindMin(int[] array, int expected) {
        assertEquals(expected, task.findMin(array));
    }

    static Stream<Arguments> getFindMinValues(){
        return Stream.of(
                Arguments.of(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 1, 10}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("getFindMaxValues")
    void checkFindMax(int[] array, int expected) {
        assertEquals(expected, task.findMax(array));
    }

    static Stream<Arguments> getFindMaxValues(){
        return Stream.of(
                Arguments.of(new int[] {2, 3, 4, 5, 6, 7, 8, 9, 1, 10}, 10)
        );
    }

    @ParameterizedTest
    @MethodSource("getFindMinByPosValues")
    void checkFindMinByPos(int[] array, int left, int right, int expected){
        assertEquals(expected, task.findMinByPos(array, left, right));
    }

    static Stream<Arguments> getFindMinByPosValues(){
        return Stream.of(
                Arguments.of(new int[] {5, 3, 4, 2, 6, 7, 8, 9, 1, 10},
                        0, 10, 1),
                Arguments.of(new int[] {5, 3, 4, 2, 6, 7, 8, 9, 1, 10},
                        0, 7, 2),
                Arguments.of(new int[] {5, 3, 4, 2, 6, 7, 8, 9, 1, 10},
                        2, 7, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("getFindMaxByPosValues")
    void checkFindMaxByPos(int[] array, int left, int right, int expected){
        assertEquals(expected, task.findMaxByPos(array, left, right));
    }

    static Stream<Arguments> getFindMaxByPosValues(){
        return Stream.of(
                Arguments.of(new int[] {1, 22, 3, 4, 5, 10, 7, 8, 9, 49},
                        0, 10, 49),
                Arguments.of(new int[] {1, 22, 3, 4, 5, 10, 7, 8, 9, 49},
                        0, 7, 22),
                Arguments.of(new int[] {1, 22, 3, 4, 5, 10, 7, 8, 9, 49},
                        2, 7, 10)
        );
    }
}