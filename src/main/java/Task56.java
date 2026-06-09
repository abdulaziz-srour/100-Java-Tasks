public class Task56 {
    /**
     * Determines whether a specified year is a leap year according to the Gregorian calendar rules.
     * A year is considered a leap year if it is divisible by 4, but not by 100,
     * unless it is also divisible by 400.
     *
     * @param year the integer representing the year to check
     * @return true if the given year is a leap year, false otherwise
     */
    boolean isLeap(int year){
        if(year % 400 == 0)
            return true;
        else if(year % 100 != 0 && year % 4 == 0)
            return true;
        else
            return false;
    }
}
