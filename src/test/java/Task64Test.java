import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.Year;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task64Test {
    private Task64 task;

    @BeforeEach
    void setUp(){
        task = new Task64();
    }
    @ParameterizedTest
    @MethodSource("getAllSundaysBetweenValues")
    void checkAllSundaysBetween(LocalDate from, LocalDate until, int expected) {
        assertEquals(expected, task.allSundaysBetween(from, until).count());
    }

    static Stream<Arguments> getAllSundaysBetweenValues(){
        return Stream.of(
                Arguments.of(LocalDate.of(2017, 1, 1), LocalDate.of(2018, 1, 1), 53),
                Arguments.of(LocalDate.of(2019, 1, 1), LocalDate.of(2019, 2, 7), 5)
        );
    }

    @ParameterizedTest
    @MethodSource("getCountLeapYearsValues")
    void checkCountLeapYears(Year from, Year until, int expected){
        assertEquals(expected, task.countLeapYears(from, until));
    }

    static Stream<Arguments> getCountLeapYearsValues(){
        return Stream.of(
                Arguments.of(Year.of(2010), Year.of(2019), 2),
                Arguments.of(Year.of(2000), Year.of(2019), 5)
        );
    }
}