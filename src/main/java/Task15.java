public class Task15 {
    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers
     * using the recursive Euclidean algorithm.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    int gcdRecursive(int a, int b){
        if(b == 0)
            return a;
        return gcdRecursive(b, a % b);
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers
     * using the iterative Euclidean algorithm.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of a and b
     */
    int gcdIterative(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calculates the Least Common Multiple (LCM) of two integers
     * by using their Greatest Common Divisor (GCD).
     *
     * @param a the first integer
     * @param b the second integer
     * @return the least common multiple of a and b
     */
    int lcm(int a, int b){
        return a * b / gcdIterative(a, b);
    }
}
