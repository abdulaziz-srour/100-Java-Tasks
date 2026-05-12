public class Task14 {

    /**
     * Calculates the total number of digits of a given integer.
     * It uses a recursive helper method to repeatedly divide the number by 10.
     *
     * @param n the integer whose digits are to be counted
     * @return the total number of digits in the given integer
     */
    int calcDigits(int n){
        return calcDigitsHelper(n, 0);
    }

    private int calcDigitsHelper(int n, int digits){
        if(n == 0)
            return digits;
        return calcDigitsHelper(n / 10, digits + 1);
    }

    /**
     * Calculates the sum of the digits of a given integer.
     * It uses recursion to add the last digit to an accumulator
     * while continuously dividing the number by 10.
     *
     * @param n the integer whose sum of digits is to be calculated
     * @return the total sum of the digits of the given integer
     */
    int calcSumOfDigits(int n){
        return calcSumOfDigitsHelper(n, 0);
    }

    private int calcSumOfDigitsHelper(int n, int sum){
        if(n == 0)
            return sum;
        return calcSumOfDigitsHelper(n / 10, sum + n % 10);
    }
}
