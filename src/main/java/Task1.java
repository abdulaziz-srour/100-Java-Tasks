import java.util.ArrayList;

public class Task1 {

    // Task a:
    // Calculates a specific index by halving the product of the inputs
    // and applying modulo 7.
    int calc(int m, int n){
        int product = m * n;
        int div = product / 2;
        int result = div % 7;
        return result;
    }


    // Task b:
    // Calculates the count and the sum of all positive numbers strictly less than 'max'
    // that are divisible by 2 or 7.
    int[] calcSumAndCountAllNumbersDivBy_2_Or_7(int max){
        int[] divBy2 = divBy(max, 2);
        int[] divBy7 = divBy(max, 7);
        int len = divBy2[0] + divBy7[0];
        int sum = divBy2[1] + divBy7[1];

        return new int[] {len, sum};
    }

    private int[] divBy(int max, int divider){
        max--;
        int sum = 0;
        int n = max/divider;
        for(int i = 1; i <= n; i++){
            sum += i * divider;
        }
        return new int[] {n, sum};
    }


    // Task c
    // Checks if a number is even or odd
    boolean isEven(int n){
        return true ? n % 2 == 0 : false;
    }

    boolean isOdd(int n){
        return true ? n % 2 != 0 : false;
    }
}
