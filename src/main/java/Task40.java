public class Task40 {
    /**
     * Converts a string representation of a number into a long value.
     * The method checks for optional '+' or '-' signs and determines the numbering
     * system based on the leading character: strings starting with a '0' are treated
     * as octal (base 8), while all others are treated as decimal (base 10).
     *
     * @param text the string to be parsed
     * @return the resulting long value
     * @throws IllegalArgumentException if the text is null, empty, contains only a sign,
     * or contains invalid characters
     */
    long strToLong(String text){
        if ((text == null || text.isEmpty()))
            throw new IllegalArgumentException("Invalid Argument");

        char firstChar = text.charAt(0);
        if(firstChar == '0'){
            return parseLong(text, '+', 8);
        } else if(firstChar == '+' || firstChar == '-'){
            if(text.length() == 1)
                throw new IllegalArgumentException("Invalid Argument");

            char secondChar = text.charAt(1);
            if(secondChar == '0')
                return parseLong(text.substring(1), firstChar, 8);
            else
                return parseLong(text.substring(1), firstChar, 10);
        } else{
            return parseLong(text, '+', 10);
        }
    }

    /**
     * Calculates the final long value from a validated numeric string.
     * The method strictly validates the input using regular expressions based on the radix.
     * It computes the value by initially processing the string as a base-10 number using
     * character values and powers of 10. If the target radix is 8, it performs a secondary
     * mathematical conversion using modulo operations and powers of 8.
     *
     * @param text  the raw numeric string to be calculated (without signs)
     * @param sign  the designated sign of the number ('+' or '-')
     * @param radix the mathematical base (8 for octal, 10 for decimal)
     * @return the calculated signed long value
     * @throws IllegalArgumentException if the string fails regex validation for the given radix
     */
    private long parseLong(String text, char sign, int radix){
        if(text.matches(".*\\D.*"))
            throw new IllegalArgumentException("Invalid Argument");
        else if(radix == 8 && !text.matches("^[0-7]+$"))
            throw new IllegalArgumentException("Invalid Argument");

        long result = 0;
        int length = text.length();
        for (int i = 0, y = length - 1; i < length; i++, y--)
            result += (long) ((text.charAt(i) - '0') * Math.pow(10, y));


        if(radix == 8){
            long temp = result;
            result = 0;
            int i = 0;
            while(temp != 0){
                result += (long) ((temp % 10) * Math.pow(8, i++));
                temp /= 10;
            }
        }
        return sign == '-' ? -result : result;
    }
}
