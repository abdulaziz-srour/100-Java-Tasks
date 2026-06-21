import java.time.Month;
import java.time.temporal.*;

public class Task65 implements TemporalAdjuster {
    /**
     * Adjusts the specified temporal object to the first day of the quarter.
     * It calculates the first month of the current quarter and sets the day of the month to 1,
     * while safely preserving the original type of the temporal object.
     *
     * @param temporal the temporal object to be adjusted
     * @return an adjusted temporal object of the same observable type, set to the start of the quarter
     */
    @Override
    public Temporal adjustInto(Temporal temporal) {
        Month month = Month.of(temporal.get(ChronoField.MONTH_OF_YEAR));
        return temporal
                .with(ChronoField.MONTH_OF_YEAR, month.firstMonthOfQuarter().getValue())
                .with(ChronoField.DAY_OF_MONTH, 1);
    }
}
