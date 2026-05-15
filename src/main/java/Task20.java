public class Task20 {

    /**
     * Determines whether a given integer is a power of two using recursion
     *
     * @param num The integer to be checked
     * @return true if the number is power of two, false otherwise
     */
    boolean isPowerOf2(int num){
        if(num == 1)
            return true;
        if(num % 2 != 0 || num <= 0)
            return false;

        return isPowerOf2(num / 2);
    }

    /**
     * Calculates the power of a given base raised to an exponent (a^b) using recursion.
     *
     * @param a The base number
     * @param b The exponent (must be zero or positive)
     * @return The result of the base raised to the power of the exponent
     * @throws IllegalArgumentException if the exponent is negative
     */
    long powerOfRecursive(int a, int b){
        if(b < 0)
            throw new IllegalArgumentException("Only positive exponents allowed!");
        return powerOfRecursiveHelper(a, b, 1);
    }

    private long powerOfRecursiveHelper(int a, int b, long result) {
        if(b == 0)
            return result;
        return powerOfRecursiveHelper(a, b - 1, a * result);
    }

    /**
     * Calculates the power of a given base raised to an exponent (a^b) using an iterative approach.
     *
     * @param a The base number
     * @param b The exponent (must be zero or positive)
     * @return The result of the base raised to the power of the exponent
     * @throws IllegalArgumentException if the exponent is negative
     */
    long powerOfIterative(int a, int b){
        if(b < 0)
            throw new IllegalArgumentException("Only positive exponents allowed!");
        long result = 1;
        while(b != 0){
            result *= a;
            b--;
        }
        return result;
    }
}
