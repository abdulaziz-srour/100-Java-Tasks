import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task42Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testOrderEvenBeforeOdd(int[] input, int[] expected){
        Task42 task = new Task42();
        assertArrayEquals(expected, task.orderEvenBeforeOdd(input));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[] {2, 4, 6, 8, 10, 3, 7, 1, 9, 5}),
                Arguments.of(new int[] {2, 4, 6, 1, 8}, new int[] {2, 4, 6, 8, 1}),
                Arguments.of(new int[] {2, 4, 6, 8, 1}, new int[] {2, 4, 6, 8, 1})
        );
    }

}