import java.time.*;

public class Task57 {
    /**
     * Demonstrates the usage of the modern Java Time API (java.time package).
     * This test method initializes various time-related objects such as LocalDate, LocalTime,
     * Period, and Duration. It specifically highlights how to calculate the exact period
     * (years, months, days) between a specific birthday and the current date.
     */
    static void main() {
        LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
        LocalTime workend = LocalTime.of(17, 30);
        LocalDateTime now = LocalDateTime.now();

        Period period = Period.of(1, 10, 20);
        Duration duration = Duration.ofHours(7)
                .plusMinutes(15);

        Period timeUntilBirthday = Period.between(birthday, now.toLocalDate());
        Period timeBirthdayUntilNow = Period.between(now.toLocalDate(), birthday);

    }
}
