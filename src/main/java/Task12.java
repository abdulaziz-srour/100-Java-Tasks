import java.util.ArrayList;
import java.util.List;

public class Task12 {

    // Calculates all prime factors of a given number.
    List<Integer> calcPrimeFactors(int num){
        List<Integer> primeFactors = new ArrayList<>();
        int primeNumber = 2;

        while(num != 1){
            if(num % primeNumber == 0){
                primeFactors.add(primeNumber);
                num /= primeNumber;
            } else{
                primeNumber = (primeNumber == 2) ? 3 : primeNumber + 2;
            }
        }
        return primeFactors;
    }
}
