import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Map;

public class Task63 {
    /**
     * Retrieves the full textual representation of the day of the week for a given date in English.
     *
     * @param date the LocalDate to evaluate
     * @return a string representing the full name of the day of the week (e.g., "Monday", "Tuesday")
     */
    String getDayOfWeek(LocalDate date){
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    /**
     * Calculates the exact dates for the first and last Friday and Sunday of a specified month and year.
     * It utilizes TemporalAdjusters to efficiently compute these exact occurrences without manual iteration.
     *
     * @param yearMonth the specific year and month to evaluate
     * @return an immutable map containing the calculated LocalDate objects mapped to the keys
     * "firstFriday", "firstSunday", "lastFriday", and "lastSunday"
     */
    Map<String, LocalDate> firstAndLastFridayAndSunday(YearMonth yearMonth){
        LocalDate date = yearMonth.atDay(1);
        return Map.of(
                "firstFriday", date.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY)),
                "firstSunday", date.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)),
                "lastFriday", date.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY)),
                "lastSunday", date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY))
        );
    }

    /**
     * Extracts both the day of the month and the day of the year from a given date.
     *
     * @param date the LocalDate to extract the information from
     * @return an integer array where the first element is the day of the month (1-31),
     * and the second element is the day of the year (1-365 or 366 in leap years)
     */
    int[] getDayOfMonthAndYear(LocalDate date){
        return new int[] {date.getDayOfMonth(), date.getDayOfYear()};
    }

}
