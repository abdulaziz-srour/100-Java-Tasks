import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task66Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testNthWeekdayAdjuster(LocalDate startDate, int nthDay, DayOfWeek dayOfWeek, LocalDate expected) {
        Task66 task = new Task66();
        assertEquals(expected, task.NthWeekdayAdjuster(startDate, nthDay, dayOfWeek));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(LocalDate.of(2015, 8, 15), 2, DayOfWeek.FRIDAY, LocalDate.of(2015, 8, 14)),
                Arguments.of(LocalDate.of(2015, 8, 15), 3, DayOfWeek.SUNDAY, LocalDate.of(2015, 8, 16)),
                Arguments.of(LocalDate.of(2015, 8, 15), 4, DayOfWeek.TUESDAY, LocalDate.of(2015, 8, 25))
        );
    }
}