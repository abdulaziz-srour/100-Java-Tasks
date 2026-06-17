import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Task62 {
    /**
     * Prints a formatted, grid-style console calendar for a specified month and year.
     * The calendar week starts on Monday. It uses dot placeholders (".. ") to align
     * the first day of the month with the correct weekday. It automatically handles
     * varying month lengths (including leap years) and pads the end of the final
     * week with dashes ("-- ") to cleanly close the grid.
     *
     * @param month the month to be printed (e.g., Month.APRIL)
     * @param year  the year of the calendar (e.g., 2020)
     */
    static void printCalendar(Month month, int year){
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println("Mo Tu We Th Fr Sa Su");
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.print(".. ".repeat(dayOfWeek.getValue() - 1));
        int dayOfMonth = 1;
        int countColumns = dayOfWeek.getValue() - 1;

        while(date.lengthOfMonth() >= dayOfMonth){
            if(countColumns == 7) {
                countColumns = 0;
                System.out.println();
            }
            if(dayOfMonth < 10)
                System.out.print("0" + dayOfMonth + " ");
            else
                System.out.print(dayOfMonth + " ");

            countColumns++;
            dayOfMonth++;
        }

        while(countColumns < 7){
            System.out.print("-- ");
            countColumns++;
        }
        System.out.println();
    }

    static void main() {
        System.out.println("April 2020: ");
        printCalendar(Month.APRIL, 2020);
        System.out.println("May 2020: ");
        printCalendar(Month.MAY, 2020);
        System.out.println("June 2020: ");
        printCalendar(Month.JUNE, 2020);
        System.out.println("August 2020");
        printCalendar(Month.AUGUST, 2020);
    }
}
