import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task67Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testEx12_NextPaydayAdjuster(LocalDate input, LocalDate expected) {
        Task67 task = new Task67();
        assertEquals(expected, task.Ex12_NextPaydayAdjuster(input));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(LocalDate.of(2019, 7, 21), LocalDate.of(2019, 7, 25)),
                Arguments.of(LocalDate.of(2019, 6, 27), LocalDate.of(2019, 7, 25)),
                Arguments.of(LocalDate.of(2019, 8, 21), LocalDate.of(2019, 8, 23)),
                Arguments.of(LocalDate.of(2019, 12, 6), LocalDate.of(2019, 12, 16)),
                Arguments.of(LocalDate.of(2019, 12, 23), LocalDate.of(2020, 1, 24))
        );
    }
}