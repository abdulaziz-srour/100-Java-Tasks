public class Task26 {

    /**
     * Checks whether a given string is a valid binary number.
     * This method checks that the string consists of the characters '0' and
     * '1' by using a regular expression.
     *
     * @param binaryNumber The string to be evaluated
     * @return true if the string is a valid binary number, false otherwise
     */
    boolean isBinaryNumber(String binaryNumber){
        if(binaryNumber == null)
            return false;
        return binaryNumber.matches("[01]+");
    }

    /**
     * Converts a binary string representation into its decimal integer equivalent.
     * The calculation processes the characters from left to right while
     * decrementing the exponent for the base-2 positional values.
     *
     * @param binaryNumber The string containing the binary sequence
     * @return the calculated decimal integer, or -1 if the input is null
     */
    int binaryToDecimal(String binaryNumber){
        if(binaryNumber == null)
            return -1;

        int sum = 0;
        int binaryDigit;
        int length = binaryNumber.length();
        for (int i = 0, y = length - 1; i < length; i++, y--) {
            binaryDigit = binaryNumber.charAt(i) - '0';
            sum += (int) (binaryDigit * Math.pow(2, y));
        }
        return sum;
    }

    /**
     * Converts a hexadecimal string representation into its decimal integer equivalent.
     * The method converts the input to uppercase. It then maps each character
     * to its decimal value using an index lookup string and applies base-16 math.
     *
     * @param hexadecimalNumber The string containing the hexadecimal sequence
     * @return The calculated decimal integer, or -1 if the input string is null
     */
    int hexToDecimal(String hexadecimalNumber){
        if(hexadecimalNumber == null)
            return -1;

        int sum = 0;
        int toDecimal;
        final String HEXDIGITS = "0123456789ABCDEF";
        int length = hexadecimalNumber.length();
        hexadecimalNumber = hexadecimalNumber.toUpperCase();

        for (int i = 0, y = length - 1; i < length; i++, y--) {
            toDecimal = HEXDIGITS.indexOf(hexadecimalNumber.charAt(i));
            sum += (int) (toDecimal * Math.pow(16, y));
        }
        return sum;
    }
}
