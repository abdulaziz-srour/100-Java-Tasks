import java.time.LocalDate;
import java.time.Month;


public class Task58 {
    /**
     * Demonstrates basic date manipulation using the LocalDate class.
     * It prints the results of adding months and days to specific dates,
     * illustrating how the API automatically handles different month lengths
     * and leap years (e.g., February 2012 vs. February 2014).
     */
    static void main() {
        System.out.println("First Date:");
        LocalDate firstDate = LocalDate.of(2012, Month.FEBRUARY, 2);
        System.out.println("Original: " + firstDate);
        System.out.println("After one Month: " + firstDate.plusMonths(1));

        System.out.println();
        System.out.println("Second Date:");
        LocalDate secondDate = LocalDate.of(2014, Month.FEBRUARY, 2);
        System.out.println("Original: " + secondDate);
        System.out.println("After one Month: " + secondDate.plusMonths(1));

        System.out.println();
        System.out.println("Third Date:");
        LocalDate thirdDate = LocalDate.of(2014, Month.APRIL, 4);
        System.out.println("Original: " + thirdDate);
        System.out.println("After one Month: " + thirdDate.plusMonths(1));

        System.out.println();
        System.out.println("Fourth Date:");
        LocalDate fourthDate = LocalDate.of(2014, Month.MAY, 5);
        System.out.println("Original: " + fourthDate);
        System.out.println("After one Month: " + fourthDate.plusMonths(1));

        // Test plusDays() instead of plusMonths()
        System.out.println("After 28 Days: " + fourthDate.plusDays(28));
        System.out.println("After 29 Days: " + fourthDate.plusDays(29));
        System.out.println("After 30 Days: " + fourthDate.plusDays(30));
        System.out.println("After 31 Days: " + fourthDate.plusDays(31));
    }

}