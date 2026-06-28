import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Task66 {
    /**
     * Calculates the date of the Nth occurrence of a specific weekday within the month
     * of the provided start date. It first identifies the initial occurrence of the
     * target weekday in that month and then iterates forward to reach the Nth occurrence.
     *
     * @param startDate the initial date used to determine the target month and year
     * @param nthDay    the occurrence number of the weekday to find (e.g., 1 for the first, 2 for the second)
     * @param dayOfWeek the specific day of the week to locate
     * @return the calculated LocalDate representing the exact Nth occurrence of the specified weekday
     */
    LocalDate NthWeekdayAdjuster(LocalDate startDate, int nthDay, DayOfWeek dayOfWeek){
        startDate = startDate.withDayOfMonth(1).with(TemporalAdjusters.nextOrSame(dayOfWeek));
        for (int i = 1; i < nthDay; i++) {
            startDate = startDate.with(TemporalAdjusters.next(dayOfWeek));
        }
        return startDate;
    }
}
