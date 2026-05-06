import java.util.HashMap;
import java.util.Map;

public class Task11 {

    // Finds and returns all pairs of amicable numbers up to a specified maximum
    // Two numbers are considered amicable if the sum of the proper divisors
    // of each number is equal to the other number.
    Map<Integer, Integer> calcAmicableNumbers(int max){
        Map<Integer, Integer> numbers = new HashMap<>();
        for(int i = 1; i <= max; i++){
            int sum = 0;
            for(int y = 1; y <= i/2; y++){
                if(i % y == 0){
                    sum += y;
                }
            }
            int temp = 0;
            for(int y = 1; y <= sum/2; y++){
                if(sum % y == 0){
                    temp += y;
                }
            }
            if(temp == i && temp != sum) {
                numbers.put(i, sum);
            }
        }
        return numbers;
    }
}
