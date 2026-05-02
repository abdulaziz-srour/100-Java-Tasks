import java.util.HashMap;
import java.util.Map;

public class Task7 {
    private Map<Character, Integer> romanNumbers;

    public Task7() {
        romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
    }

    // Task a:
    // Converts a Roman numeral string to an integer, accounting for subtraction rules (like IV or IX)
    int fromRomanNumber(String rnumber){

        int num = 0;
        for(int i = 0; i < rnumber.length(); i++){
            char firstNumber = rnumber.charAt(i);
            int firstIntNumber = romanNumbers.get(firstNumber);
            if((i + 1) < rnumber.length()){
                char secondNumber = rnumber.charAt(i + 1);
                int secondIntNumber = romanNumbers.get(secondNumber);
                if(firstIntNumber >= secondIntNumber){
                    num += firstIntNumber;
                } else {
                    num += secondIntNumber - firstIntNumber;
                    i++;
                }
            } else {
                num += firstIntNumber;
            }
        }

        return num;
    }
}
