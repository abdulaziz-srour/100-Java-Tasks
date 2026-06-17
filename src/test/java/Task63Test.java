import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task63Test {
    private Task63 task;
    @BeforeEach
    void setUp(){
        task = new Task63();
    }


    @ParameterizedTest
    @MethodSource("getCheckGetDayOfWeekValues")
    void checkGetDayOfWeek(LocalDate date, String expected) {
        assertEquals(expected, task.getDayOfWeek(date));
    }

    static Stream<Arguments> getCheckGetDayOfWeekValues(){
        return Stream.of(
                Arguments.of(LocalDate.of(2019, Month.DECEMBER, 24), "Tuesday"),
                Arguments.of(LocalDate.of(2019, Month.DECEMBER, 1), "Sunday"),
                Arguments.of(LocalDate.of(2019, Month.DECEMBER, 31), "Tuesday")
        );
    }

    @ParameterizedTest
    @MethodSource("getCheckFirstAndLastFridayAndSunday")
    void checkFirstAndLastFridayAndSunday(YearMonth yearMonth, Map<String, LocalDate> expected) {
        assertEquals(expected, task.firstAndLastFridayAndSunday(yearMonth));
    }

    static Stream<Arguments> getCheckFirstAndLastFridayAndSunday(){
        return Stream.of(
                Arguments.of(
                        YearMonth.of(2019, Month.MARCH),
                        Map.of(
                                "firstFriday", LocalDate.of(2019, Month.MARCH, 1),
                                "firstSunday", LocalDate.of(2019, Month.MARCH, 3),
                                "lastFriday", LocalDate.of(2019, Month.MARCH, 29),
                                "lastSunday", LocalDate.of(2019, Month.MARCH, 31)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getCheckGetDayOfMonthAndYear")
    void checkGetDayOfMonthAndYear(LocalDate date, int[] expected) {
        assertArrayEquals(expected, task.getDayOfMonthAndYear(date));
    }

    static Stream<Arguments> getCheckGetDayOfMonthAndYear(){
        return Stream.of(
                Arguments.of(LocalDate.of(2019, Month.MARCH, 1), new int[] {1, 60}),
                Arguments.of(LocalDate.of(2019, Month.MARCH, 3), new int[] {3, 62}),
                Arguments.of(LocalDate.of(2019, Month.MARCH, 29), new int[] {29, 88}),
                Arguments.of(LocalDate.of(2019, Month.MARCH, 31), new int[] {31, 90})
        );
    }
}