import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Task67 {
    /**
     * Calculates the next typical payday in Switzerland based on a given input date.
     * The standard payday is the 25th of the month. If the 25th falls on a weekend,
     * the payday is moved to the preceding Friday. For December, a special rule applies:
     * the payday is the 15th, or the following Monday if the 15th is a weekend.
     * The method automatically rolls over to the next month if the input date is past
     * the respective threshold (after the 17th in December, or after the 25th in other months).
     *
     * @param inputDate the initial date from which the next payday should be calculated
     * @return the calculated LocalDate representing the exact next payday
     */
    LocalDate Ex12_NextPaydayAdjuster(LocalDate inputDate){
        if(inputDate.getMonth() == Month.DECEMBER && inputDate.getDayOfMonth() > 17) {
            inputDate = inputDate.plusMonths(1);
        } else if(inputDate.getMonth() != Month.DECEMBER && inputDate.getDayOfMonth() > 25){
            inputDate = inputDate.plusMonths(1);
            if(inputDate.getMonth() == Month.DECEMBER)
                inputDate = inputDate.withDayOfMonth(13);
        }


        if(inputDate.getMonth() != Month.DECEMBER) {
            if (isWeekend(inputDate.withDayOfMonth(25).getDayOfWeek())) {
                inputDate = inputDate.withDayOfMonth(23);
                return inputDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
            } else{
                return inputDate.withDayOfMonth(25);
            }
        }else {
            if (isWeekend(inputDate.withDayOfMonth(15).getDayOfWeek())) {
                inputDate = inputDate.withDayOfMonth(15);
                return inputDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
            } else{
                return inputDate.withDayOfMonth(15);
            }
        }
    }

    /**
     * Helper method to determine whether a given day of the week falls on a weekend.
     *
     * @param dayOfWeek the day of the week to check
     * @return true if the specified day is a Saturday or Sunday, false otherwise
     */
    private boolean isWeekend(DayOfWeek dayOfWeek){
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}
