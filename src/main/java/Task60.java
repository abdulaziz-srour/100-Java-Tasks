import java.time.*;

public class Task60 {
    /**
     * Simulates a flight from Zurich to San Francisco to demonstrate
     * advanced time zone handling using ZonedDateTime and Duration.
     * It tracks the absolute instant of the flight's departure and arrival, converting
     * the times dynamically between "Europe/Zurich" and "America/Los_Angeles" using
     * the withZoneSameInstant method.
     */
    static void main() {
        ZonedDateTime flightStart = ZonedDateTime.of(
                LocalDateTime.of(
                        LocalDate.of(2019, Month.SEPTEMBER, 15),
                        LocalTime.of(13, 10)
                ),
                ZoneId.of("Europe/Zurich")
        );
        Duration flightDuration = Duration.ofHours(11).plusMinutes(50);
        System.out.println("Flight Start from Zurich (Zurich Time): " + flightStart);
        System.out.println("Flight Arrival at San Francisco (Zurich Time): "
                + flightStart.plus(flightDuration));

        System.out.println();
        ZonedDateTime flightStartLA = flightStart.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Flight Start from Zurich (Los Angeles Time): " + flightStartLA);
        System.out.println("Flight Arrival at San Francisco (Los Angeles Time): "
                + flightStartLA.plus(flightDuration));
    }
}
