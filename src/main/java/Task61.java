import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task61 {
    /**
     * Finds all occurrences of Friday the 13th within a specified date range.
     *
     * @param from the starting date of the range (inclusive)
     * @param to   the ending date of the range (exclusive)
     * @return a list of LocalDate objects representing every Friday the 13th in the given period
     */
    static List<LocalDate> allFriday13th(LocalDate from, LocalDate to) {
        if (from.withDayOfMonth(13).isAfter(to))
            return List.of();

        Stream<LocalDate> stream = getStream(from, to);
        return stream.filter(e -> e.getDayOfWeek() == DayOfWeek.FRIDAY)
                .toList();
    }

    /**
     * Finds all occurrences of Friday the 13th within a specified date range and groups them by year.
     *
     * @param from the starting date of the range (inclusive)
     * @param to   the ending date of the range (exclusive)
     * @return a map where the key is the year and the value is a list of Friday the 13th dates for that year
     */
    static Map<Integer, List<LocalDate>> friday13thGrouped(LocalDate from, LocalDate to){
        if (from.withDayOfMonth(13).isAfter(to))
            return Map.of();

        Stream<LocalDate> stream = getStream(from, to);
        return stream.filter(e -> e.getDayOfWeek() == DayOfWeek.FRIDAY)
                .collect(Collectors.groupingBy(LocalDate::getYear));
    }

    /**
     * Generates a stream of dates falling exclusively on the 13th of each month within the specified range.
     * It calculates the correct starting month based on the starting date's day of the month.
     *
     * @param from the starting date of the range
     * @param to   the ending date of the range
     * @return a stream of LocalDate objects, each representing the 13th day of a month
     */
    private static Stream<LocalDate> getStream(LocalDate from, LocalDate to) {
        if (from.getDayOfMonth() > 13)
            return from.plusMonths(1).withDayOfMonth(13).datesUntil(to, Period.ofMonths(1));
        else
            return from.withDayOfMonth(13).datesUntil(to, Period.ofMonths(1));
    }

    static void main() {
        System.out.println(allFriday13th(
                LocalDate.of(2013, Month.JANUARY, 1),
                LocalDate.of(2015, Month.DECEMBER, 31)
        ));

        System.out.println(friday13thGrouped(
                LocalDate.of(2013, Month.JANUARY, 1),
                LocalDate.of(2015, Month.DECEMBER, 31)
        ));
    }
}