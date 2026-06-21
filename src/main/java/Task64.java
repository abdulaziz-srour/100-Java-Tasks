import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
import java.util.stream.Stream;

public class Task64 {
    /**
     * Generates a stream of all dates that fall on a Sunday within a specified date range.
     * It uses an efficient approach by locating the first occurring Sunday and
     * iterating forward in one-week increments.
     *
     * @param from  the starting date of the range (inclusive)
     * @param until the ending date of the range (exclusive)
     * @return a Stream of LocalDate objects representing every Sunday in the given period
     */
    Stream<LocalDate> allSundaysBetween(LocalDate from, LocalDate until){
        LocalDate firstSunday = from.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));

        if(firstSunday.isAfter(until))
            return Stream.empty();

        return firstSunday.datesUntil(until, Period.ofWeeks(1));
    }

    /**
     * Counts the total number of leap years within a specified range of years.
     * It sequentially checks each year from the start year up to, but not including,
     * the end year.
     *
     * @param from  the starting year (inclusive)
     * @param until the ending year (exclusive)
     * @return the total count of leap years found within the specified range
     */
    long countLeapYears(Year from, Year until){
        long count = 0;
        while(from.isBefore(until)){
            if(from.isLeap())
                count++;
            from = from.plusYears(1);
        }
        return count;
    }
}
