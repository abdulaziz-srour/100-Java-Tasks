public class Task19 {
    private static final String HEX_DECIMALS = "0123456789ABCDEF";

    /**
     * Converts a positive integer into its binary string representation.
     *
     * @param num The positive integer to be converted
     * @return a string representing the binary value of the given number
     * @throws IllegalArgumentException if the given number is negative
     */
    String toBinary(int num){
        if(num < 0)
            throw new IllegalArgumentException("Only positive numbers!");
        else if(num == 0)
            return "0";

        return toBinaryHelper(num, new StringBuilder());
    }

    private String toBinaryHelper(int num, StringBuilder reminder) {
        if(num == 0)
            return reminder.reverse().toString();

        return toBinaryHelper(num / 2, reminder.append(num % 2));
    }

    /**
     * Converts a positive integer into its octal string representation.
     *
     * @param num The positive integer to be converted
     * @return a string representing the octal value of the given number
     * @throws IllegalArgumentException if the given number is negative
     */
    String toOctal(int num){
        if(num < 0)
            throw new IllegalArgumentException("Only positive numbers!");
        else if(num == 0)
            return "0";

        return toOctalHelper(num, new StringBuilder());
    }

    private String toOctalHelper(int num, StringBuilder reminder) {
        if(num == 0)
            return reminder.reverse().toString();

        return toOctalHelper(num / 8, reminder.append(num % 8));
    }

    /**
     * Converts a positive integer into its octal string representation.
     *
     * @param num The positive integer to be converted
     * @return a string representing the hexadecimal value of the given number
     * @throws IllegalArgumentException if the given number is negative
     */
    String toHex(int num){
        if(num < 0)
            throw new IllegalArgumentException("Only positive numbers!");
        else if(num == 0)
            return "0";

        return toHexHelper(num, new StringBuilder());
    }

    private String toHexHelper(int num, StringBuilder reminder) {
        if(num == 0)
            return reminder.reverse().toString();

        char hexDecimal = HEX_DECIMALS.charAt(num % 16);
        return toHexHelper(num / 16, reminder.append(hexDecimal));
    }
}
