import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task65Test {

    @ParameterizedTest
    @MethodSource("getAdjustIntoValues")
    void checkAdjustInto(LocalDate input, LocalDate expected) {
        Task65 task = new Task65();
        assertEquals(expected, task.adjustInto(input));
    }

    static Stream<Arguments> getAdjustIntoValues(){
        return Stream.of(
                Arguments.of(LocalDate.of(2014, 3, 15), LocalDate.of(2014, 1, 1)),
                Arguments.of(LocalDate.of(2014, 6, 15), LocalDate.of(2014, 4, 1)),
                Arguments.of(LocalDate.of(2014, 9, 15), LocalDate.of(2014, 7, 1)),
                Arguments.of(LocalDate.of(2014, 11, 15), LocalDate.of(2014, 10, 1))
        );
    }
}